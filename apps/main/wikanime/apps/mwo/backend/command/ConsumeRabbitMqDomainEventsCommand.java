package wikanime.apps.mwo.backend.command;

import wikanime.shared.infrastructure.bus.event.rabbitmq.RabbitMqDomainEventsConsumer;
import wikanime.shared.infrastructure.cli.ConsoleCommand;

public class ConsumeRabbitMqDomainEventsCommand extends ConsoleCommand {
    private final RabbitMqDomainEventsConsumer consumer;

    public ConsumeRabbitMqDomainEventsCommand(RabbitMqDomainEventsConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void execute(String[] args) {
        consumer.consume();
    }
}
