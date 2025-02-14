package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.CaseService;
import org.cibseven.bpm.engine.runtime.CaseInstance;
import org.cibseven.bpm.engine.runtime.CaseInstanceQuery;

public class CaseInstanceQueryMock extends AbstractQueryMock<CaseInstanceQueryMock, CaseInstanceQuery, CaseInstance, CaseService> {

  public CaseInstanceQueryMock() {
    super(CaseInstanceQuery.class, CaseService.class);
   }

}
