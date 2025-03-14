package org.cibseven.community.mockito.function;


import java.util.function.Function;

import org.cibseven.bpm.engine.ProcessEngine;
import org.cibseven.bpm.engine.ProcessEngineConfiguration;
import org.cibseven.bpm.engine.impl.ProcessEngineImpl;

/**
 * Hides the nasty "getConfiguration from given Engine Hack" in an easy to use
 * function.
 */
public enum GetProcessEngineConfiguration implements Function<ProcessEngine, ProcessEngineConfiguration> {
  INSTANCE;

  @Override
  public ProcessEngineConfiguration apply(final ProcessEngine processEngine) {
    if (!(processEngine instanceof ProcessEngineImpl)) {
      throw new IllegalArgumentException("processEngine must not be null and of type ProcessEngineImpl!");
    }

    return ((ProcessEngineImpl) processEngine).getProcessEngineConfiguration();
  }

}
