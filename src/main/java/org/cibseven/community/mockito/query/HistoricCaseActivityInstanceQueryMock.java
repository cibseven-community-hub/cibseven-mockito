package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricCaseActivityInstance;
import org.cibseven.bpm.engine.history.HistoricCaseActivityInstanceQuery;

public class HistoricCaseActivityInstanceQueryMock extends AbstractQueryMock<HistoricCaseActivityInstanceQueryMock, HistoricCaseActivityInstanceQuery, HistoricCaseActivityInstance, HistoryService> {

  public HistoricCaseActivityInstanceQueryMock() {
    super(HistoricCaseActivityInstanceQuery.class, HistoryService.class);
   }

}
