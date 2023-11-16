package wikanime.apps.mwo.backend.command;

import wikanime.shared.infrastructure.bus.event.postgresql.PostgresDomainEventsConsumer;
import wikanime.shared.infrastructure.cli.ConsoleCommand;

public class ConsumePostgresDomainEventsCommand extends ConsoleCommand {
    private final PostgresDomainEventsConsumer consumer;

    public ConsumePostgresDomainEventsCommand(PostgresDomainEventsConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void execute(String[] args) {
        consumer.consume();
    }
}
