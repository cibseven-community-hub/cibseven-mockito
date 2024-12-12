package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricCaseInstance;
import org.cibseven.bpm.engine.history.HistoricCaseInstanceQuery;

public class HistoricCaseInstanceQueryMock extends AbstractQueryMock<HistoricCaseInstanceQueryMock, HistoricCaseInstanceQuery, HistoricCaseInstance, HistoryService> {

  public HistoricCaseInstanceQueryMock() {
    super(HistoricCaseInstanceQuery.class, HistoryService.class);
   }

}
