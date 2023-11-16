package wikanime.shared.infrastructure.bus.event.spring;

import org.springframework.context.ApplicationEventPublisher;
import wikanime.shared.domain.bus.event.DomainEvent;
import wikanime.shared.domain.bus.event.EventBus;

import java.util.List;

public class SpringApplicationEventBus implements EventBus {
    private final ApplicationEventPublisher publisher;

    public SpringApplicationEventBus(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    private void publish(final DomainEvent event) {
        this.publisher.publishEvent(event);
    }

    @Override
    public void publish(List<DomainEvent> events) {
        events.forEach(this::publish);

    }
}
