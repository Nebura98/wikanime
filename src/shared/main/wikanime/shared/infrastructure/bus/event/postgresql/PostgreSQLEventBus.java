package wikanime.shared.infrastructure.bus.event.postgresql;

import wikanime.shared.domain.bus.event.DomainEvent;
import wikanime.shared.domain.bus.event.EventBus;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class PostgreSQLEventBus implements EventBus {

    @Override
    public void publish(List<DomainEvent> events) {
        events.forEach(this::publish);
    }

    private void publish(DomainEvent event) {
        String id = event.eventId();
        String aggregateId = event.aggregateId();
        String name = event.eventName();
        HashMap<String, Serializable> body = event.toPrimitives();
        String occurredOn = event.occurredOn();
    }
}
