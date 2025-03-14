package org.cibseven.community.mockito.message;

import org.cibseven.bpm.engine.RuntimeService;
import org.cibseven.bpm.engine.runtime.MessageCorrelationBuilder;
import org.cibseven.community.mockito.answer.FluentMessageCorrelationBuilderAnswer;

import java.util.function.Supplier;

import static org.mockito.Mockito.when;

public class MessageCorrelationBuilderMock implements Supplier<MessageCorrelationBuilder> {

  private final MessageCorrelationBuilder builder;

  public MessageCorrelationBuilderMock() {
    builder = FluentMessageCorrelationBuilderAnswer.createMock();
  }

  @Override
  public MessageCorrelationBuilder get() {
    return builder;
  }

  /**
   * Create and register a mock for mocked runtimeService and a message name.
   *
   * @param service     mocked runtime service.
   * @param messageName message name to register the fluent builder for.
   *
   * @return mock
   */
  public MessageCorrelationBuilderMock forServiceAndMessage(RuntimeService service, String messageName) {

    try {
      when(service.createMessageCorrelation(messageName)).thenReturn(get());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    return this;
  }

}
