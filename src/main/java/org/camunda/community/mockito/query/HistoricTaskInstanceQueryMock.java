package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricTaskInstance;
import org.cibseven.bpm.engine.history.HistoricTaskInstanceQuery;

public class HistoricTaskInstanceQueryMock extends AbstractQueryMock<HistoricTaskInstanceQueryMock, HistoricTaskInstanceQuery, HistoricTaskInstance, HistoryService> {

  public HistoricTaskInstanceQueryMock() {
    super(HistoricTaskInstanceQuery.class, HistoryService.class);
   }

}
