package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.runtime.Job;
import org.cibseven.bpm.engine.runtime.JobQuery;

public class JobQueryMock extends AbstractQueryMock<JobQueryMock, JobQuery, Job, ManagementService> {

  public JobQueryMock() {
    super(JobQuery.class, ManagementService.class);
   }

}
