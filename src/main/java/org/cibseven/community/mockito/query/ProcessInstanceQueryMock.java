package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.RuntimeService;
import org.cibseven.bpm.engine.runtime.ProcessInstance;
import org.cibseven.bpm.engine.runtime.ProcessInstanceQuery;

public class ProcessInstanceQueryMock extends AbstractQueryMock<ProcessInstanceQueryMock, ProcessInstanceQuery, ProcessInstance, RuntimeService> {

  public ProcessInstanceQueryMock() {
    super(ProcessInstanceQuery.class, RuntimeService.class);
   }

}
