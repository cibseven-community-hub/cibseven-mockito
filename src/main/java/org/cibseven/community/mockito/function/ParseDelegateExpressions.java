package org.cibseven.community.mockito.function;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.cibseven.bpm.model.bpmn.impl.BpmnModelConstants.CAMUNDA_ATTRIBUTE_DELEGATE_EXPRESSION;
import static org.cibseven.bpm.model.bpmn.impl.BpmnModelConstants.CAMUNDA_ELEMENT_EXECUTION_LISTENER;
import static org.cibseven.bpm.model.bpmn.impl.BpmnModelConstants.CAMUNDA_ELEMENT_TASK_LISTENER;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.lang3.tuple.Pair;
import org.cibseven.community.mockito.DelegateExpressions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Parses a given BPMN File and returns a Set of all delegateExpression names.
 *
 * @author Jan Galinski, Holisticon AG
 */
public class ParseDelegateExpressions implements Function<URL, List<Pair<ParseDelegateExpressions.ExpressionType, String>>> {

  public static enum ExpressionType {
    EXECUTION_LISTENER(CAMUNDA_ELEMENT_EXECUTION_LISTENER) {
      @Override
      public void registerMock(final String name) {
        DelegateExpressions.registerExecutionListenerMock(name);
      }
    }, TASK_LISTENER(CAMUNDA_ELEMENT_TASK_LISTENER) {
      @Override
      public void registerMock(final String name) {
        DelegateExpressions.registerTaskListenerMock(name);
      }
    }, JAVA_DELEGATE("serviceTask") {
      @Override
      public void registerMock(final String name) {
        DelegateExpressions.registerJavaDelegateMock(name);
      }
    };

    private final String element;

    ExpressionType(final String element) {
      this.element = element;
    }

    public abstract void registerMock(final String name);
  }

  /**
   * Regex to extract the delegateExpression name (#{hello} -> hello).
   */
  static final String PATTERN_DELEGATE_EXPRESSION = "[#$]\\{([^}]+)}";

  public static String extractDelegateExpressionName(final String delegateExpression) {
    return isNotBlank(delegateExpression) ? delegateExpression.replaceAll(PATTERN_DELEGATE_EXPRESSION, "$1") : null;
  }

  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final ReadXmlDocumentFromResource readXmlDocumentFromResource = new ReadXmlDocumentFromResource();

  @Override
  public List<Pair<ExpressionType, String>> apply(final URL bpmnResource) {
    final Element root = new ReadXmlDocumentFromResource().apply(bpmnResource).getDocumentElement();

    return new ArrayList<Pair<ExpressionType, String>>() {
      {
        for (ExpressionType type : ExpressionType.values()) {
          final NodeList nodes = root.getElementsByTagNameNS("*", type.element);

          for (int i = 0; i < nodes.getLength(); i++) {
            final NamedNodeMap attributes = nodes.item(i).getAttributes();

            // TODO: this is not nice, but I cannot get getNamedItemNS("*", ...) to work properly
            Node delegateExpression = Optional
              .ofNullable(attributes.getNamedItem(CAMUNDA_ATTRIBUTE_DELEGATE_EXPRESSION))
              .orElse(attributes.getNamedItem("camunda:"+CAMUNDA_ATTRIBUTE_DELEGATE_EXPRESSION));

            if (delegateExpression != null) {
              add(Pair.of(type, extractDelegateExpressionName(delegateExpression.getTextContent())));
            }
          }

        }
      }
    };
  }

}
