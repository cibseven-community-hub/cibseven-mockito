package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricVariableInstance;
import org.cibseven.bpm.engine.history.HistoricVariableInstanceQuery;

public class HistoricVariableInstanceQueryMock extends AbstractQueryMock<HistoricVariableInstanceQueryMock, HistoricVariableInstanceQuery, HistoricVariableInstance, HistoryService> {

  public HistoricVariableInstanceQueryMock() {
    super(HistoricVariableInstanceQuery.class, HistoryService.class);
   }

}
