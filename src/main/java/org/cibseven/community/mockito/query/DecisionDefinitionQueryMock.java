package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.RepositoryService;
import org.cibseven.bpm.engine.repository.DecisionDefinition;
import org.cibseven.bpm.engine.repository.DecisionDefinitionQuery;

public class DecisionDefinitionQueryMock extends AbstractQueryMock<DecisionDefinitionQueryMock, DecisionDefinitionQuery, DecisionDefinition, RepositoryService> {

  public DecisionDefinitionQueryMock() {
    super(DecisionDefinitionQuery.class, RepositoryService.class);
   }

}
