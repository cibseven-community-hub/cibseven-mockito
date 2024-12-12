package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.management.JobDefinition;
import org.cibseven.bpm.engine.management.JobDefinitionQuery;

public class JobDefinitionQueryMock extends AbstractQueryMock<JobDefinitionQueryMock, JobDefinitionQuery, JobDefinition, ManagementService> {

  public JobDefinitionQueryMock() {
    super(JobDefinitionQuery.class, ManagementService.class);
   }

}
