package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricDecisionInstance;
import org.cibseven.bpm.engine.history.HistoricDecisionInstanceQuery;

public class HistoricDecisionInstanceQueryMock extends AbstractQueryMock<HistoricDecisionInstanceQueryMock, HistoricDecisionInstanceQuery, HistoricDecisionInstance, HistoryService> {

  public HistoricDecisionInstanceQueryMock() {
    super(HistoricDecisionInstanceQuery.class, HistoryService.class);
   }

}
