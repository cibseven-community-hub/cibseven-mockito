package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.batch.history.HistoricBatch;
import org.cibseven.bpm.engine.batch.history.HistoricBatchQuery;

public class HistoricBatchQueryMock extends AbstractQueryMock<HistoricBatchQueryMock, HistoricBatchQuery, HistoricBatch, HistoryService> {

  public HistoricBatchQueryMock() {
    super(HistoricBatchQuery.class, HistoryService.class);
   }

}
