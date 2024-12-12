package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.RuntimeService;
import org.cibseven.bpm.engine.runtime.Execution;
import org.cibseven.bpm.engine.runtime.ExecutionQuery;

public class ExecutionQueryMock extends AbstractQueryMock<ExecutionQueryMock, ExecutionQuery, Execution, RuntimeService> {

  public ExecutionQueryMock() {
    super(ExecutionQuery.class, RuntimeService.class);
   }

}
