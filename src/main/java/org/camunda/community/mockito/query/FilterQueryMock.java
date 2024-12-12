package org.camunda.community.mockito.query;

import org.cibseven.bpm.engine.FilterService;
import org.cibseven.bpm.engine.filter.Filter;
import org.cibseven.bpm.engine.filter.FilterQuery;

public class FilterQueryMock extends AbstractQueryMock<FilterQueryMock, FilterQuery, Filter, FilterService> {

  public FilterQueryMock() {
    super(FilterQuery.class, FilterService.class);
   }

}
