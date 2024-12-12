package org.cibseven.community.mockito.query;

import org.cibseven.bpm.engine.RuntimeService;
import org.cibseven.bpm.engine.runtime.EventSubscription;
import org.cibseven.bpm.engine.runtime.EventSubscriptionQuery;

public class EventSubscriptionQueryMock extends AbstractQueryMock<EventSubscriptionQueryMock, EventSubscriptionQuery, EventSubscription, RuntimeService> {

  public EventSubscriptionQueryMock() {
    super(EventSubscriptionQuery.class, RuntimeService.class);
   }

}
