package org.cibseven.community.mockito.delegate;


import org.cibseven.community.bpm.data.CamundaBpmData;
import org.cibseven.community.bpm.data.factory.VariableFactory;
import org.cibseven.bpm.engine.variable.VariableMap;
import org.cibseven.bpm.engine.variable.Variables;
import org.cibseven.bpm.engine.variable.value.StringValue;
import org.cibseven.community.mockito.CamundaMockito;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.cibseven.bpm.engine.variable.Variables.stringValue;

public class VariableScopeFakeTest {

  private final VariableScopeFake<?> variableScope = CamundaMockito.variableScopeFake();

  @Test
  public void create_withVariable() throws Exception {
    variableScope.withVariable("foo", 1).withVariables(Variables.putValue("bar", 2));

    assertThat(variableScope.getVariableNames()).containsOnly("foo", "bar");
  }

  @Test
  public void variablesTyped() throws Exception {
    VariableMap variables = Variables.putValueTyped("foo", stringValue("bar"));

    variableScope.setVariablesLocal(variables);

    StringValue foo = variableScope.getVariableLocalTyped("foo");

    assertThat(foo.getValue()).isEqualTo("bar");
  }

  @Test
  public void variable_from_factory() {
    VariableFactory<String> foo = CamundaBpmData.stringVariable("foo");
    VariableFactory<Integer> bar = CamundaBpmData.intVariable("bar");

    variableScope
      .withVariable(foo, "1")
    .withVariable(bar, 1);

    assertThat(foo.from(variableScope).get()).isEqualTo("1");
    assertThat(bar.from(variableScope).get()).isEqualTo(1);
  }

  @Test
  public void variablesLocal() throws Exception {
    VariableMap variables = Variables.putValue("foo", "bar");
    variableScope.setVariablesLocal(variables);

    String foo = (String) variableScope.getVariableLocal("foo");

    assertThat(foo).isEqualTo("bar");

  }
}
