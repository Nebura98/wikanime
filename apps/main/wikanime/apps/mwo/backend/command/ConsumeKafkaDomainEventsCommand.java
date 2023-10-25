package wikanime.apps.mwo.backend.command;

import wikanime.shared.infrastructure.bus.event.kafka.KafkaDomainEventsConsumer;

public class ConsumeKafkaDomainEventsCommand extends KafkaDomainEventsConsumer {

    @Override
    public void consume(String value, String topic, String key) {
        this.logger.info(String.format("Consumed event from topic %s: key = %-10s value = %s", topic, key, value));
    }
}
