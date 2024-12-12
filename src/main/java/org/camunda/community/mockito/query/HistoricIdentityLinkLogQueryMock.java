package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricIdentityLinkLog;
import org.cibseven.bpm.engine.history.HistoricIdentityLinkLogQuery;

public class HistoricIdentityLinkLogQueryMock extends AbstractQueryMock<HistoricIdentityLinkLogQueryMock, HistoricIdentityLinkLogQuery, HistoricIdentityLinkLog, HistoryService> {

  public HistoricIdentityLinkLogQueryMock() {
    super(HistoricIdentityLinkLogQuery.class, HistoryService.class);
   }

}
