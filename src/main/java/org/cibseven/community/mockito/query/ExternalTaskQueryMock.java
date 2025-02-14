package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.ExternalTaskService;
import org.cibseven.bpm.engine.externaltask.ExternalTask;
import org.cibseven.bpm.engine.externaltask.ExternalTaskQuery;

public class ExternalTaskQueryMock extends AbstractQueryMock<ExternalTaskQueryMock, ExternalTaskQuery, ExternalTask, ExternalTaskService> {

  public ExternalTaskQueryMock() {
    super(ExternalTaskQuery.class, ExternalTaskService.class);
   }

}
