package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.management.DeploymentStatistics;
import org.cibseven.bpm.engine.management.DeploymentStatisticsQuery;

public class DeploymentStatisticsQueryMock extends AbstractQueryMock<DeploymentStatisticsQueryMock, DeploymentStatisticsQuery, DeploymentStatistics, ManagementService> {

  public DeploymentStatisticsQueryMock() {
    super(DeploymentStatisticsQuery.class, ManagementService.class);
   }

}
