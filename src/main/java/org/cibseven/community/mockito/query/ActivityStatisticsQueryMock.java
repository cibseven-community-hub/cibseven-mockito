package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.management.ActivityStatistics;
import org.cibseven.bpm.engine.management.ActivityStatisticsQuery;

public class ActivityStatisticsQueryMock extends AbstractQueryMock<ActivityStatisticsQueryMock, ActivityStatisticsQuery, ActivityStatistics, ManagementService> {

  public ActivityStatisticsQueryMock() {
    super(ActivityStatisticsQuery.class, ManagementService.class);
   }

}
