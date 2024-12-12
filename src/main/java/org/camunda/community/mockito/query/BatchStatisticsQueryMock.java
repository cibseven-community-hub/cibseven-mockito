package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.batch.BatchStatistics;
import org.cibseven.bpm.engine.batch.BatchStatisticsQuery;

public class BatchStatisticsQueryMock extends AbstractQueryMock<BatchStatisticsQueryMock, BatchStatisticsQuery, BatchStatistics, ManagementService> {

  public BatchStatisticsQueryMock() {
    super(BatchStatisticsQuery.class, ManagementService.class);
   }

}
