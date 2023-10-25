package wikanime.shared.infrastructure.bus.event.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

public abstract class KafkaDomainEventsConsumer {
    public final Logger logger = LoggerFactory.getLogger(KafkaDomainEventsConsumer.class);

    abstract public void consume(
            String value,
            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
            @Header(KafkaHeaders.RECEIVED_KEY) String key
    );

}
