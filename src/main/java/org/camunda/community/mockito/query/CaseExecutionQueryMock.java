package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.CaseService;
import org.cibseven.bpm.engine.runtime.CaseExecution;
import org.cibseven.bpm.engine.runtime.CaseExecutionQuery;

public class CaseExecutionQueryMock extends AbstractQueryMock<CaseExecutionQueryMock, CaseExecutionQuery, CaseExecution, CaseService> {

  public CaseExecutionQueryMock() {
    super(CaseExecutionQuery.class, CaseService.class);
   }

}
