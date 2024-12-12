package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.RuntimeService;
import org.cibseven.bpm.engine.runtime.VariableInstance;
import org.cibseven.bpm.engine.runtime.VariableInstanceQuery;

public class VariableInstanceQueryMock extends AbstractQueryMock<VariableInstanceQueryMock, VariableInstanceQuery, VariableInstance, RuntimeService> {

  public VariableInstanceQueryMock() {
    super(VariableInstanceQuery.class, RuntimeService.class);
   }

}
