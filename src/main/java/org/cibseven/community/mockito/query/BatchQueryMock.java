package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.ManagementService;
import org.cibseven.bpm.engine.batch.Batch;
import org.cibseven.bpm.engine.batch.BatchQuery;

public class BatchQueryMock extends AbstractQueryMock<BatchQueryMock, BatchQuery, Batch, ManagementService> {

  public BatchQueryMock() {
    super(BatchQuery.class, ManagementService.class);
   }

}
