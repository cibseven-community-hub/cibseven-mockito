package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.RepositoryService;
import org.cibseven.bpm.engine.repository.CaseDefinition;
import org.cibseven.bpm.engine.repository.CaseDefinitionQuery;

public class CaseDefinitionQueryMock extends AbstractQueryMock<CaseDefinitionQueryMock, CaseDefinitionQuery, CaseDefinition, RepositoryService> {

  public CaseDefinitionQueryMock() {
    super(CaseDefinitionQuery.class, RepositoryService.class);
   }

}
