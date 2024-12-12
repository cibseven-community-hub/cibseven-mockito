package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricDetail;
import org.cibseven.bpm.engine.history.HistoricDetailQuery;

public class HistoricDetailQueryMock extends AbstractQueryMock<HistoricDetailQueryMock, HistoricDetailQuery, HistoricDetail, HistoryService> {

  public HistoricDetailQueryMock() {
    super(HistoricDetailQuery.class, HistoryService.class);
   }

}
