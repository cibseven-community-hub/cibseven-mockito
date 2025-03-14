package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.IdentityService;
import org.cibseven.bpm.engine.identity.Tenant;
import org.cibseven.bpm.engine.identity.TenantQuery;

public class TenantQueryMock extends AbstractQueryMock<TenantQueryMock, TenantQuery, Tenant, IdentityService> {

  public TenantQueryMock() {
    super(TenantQuery.class, IdentityService.class);
   }

}
