package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.HistoryService;
import org.cibseven.bpm.engine.history.HistoricActivityStatistics;
import org.cibseven.bpm.engine.history.HistoricActivityStatisticsQuery;

public class HistoricActivityStatisticsQueryMock extends AbstractQueryMock<HistoricActivityStatisticsQueryMock, HistoricActivityStatisticsQuery, HistoricActivityStatistics, HistoryService> {

  public HistoricActivityStatisticsQueryMock() {
    super(HistoricActivityStatisticsQuery.class, HistoryService.class);
   }

}
