package wikanime.apps.mwo.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import wikanime.apps.mwo.backend.command.ConsumePostgresDomainEventsCommand;
import wikanime.apps.mwo.backend.command.ConsumeRabbitMqDomainEventsCommand;
import wikanime.shared.domain.Service;

import java.util.HashMap;

@SpringBootApplication()
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
        value = {"wikanime.shared", "wikanime.mwo", "wikanime.apps.backoffice.frontend"}
)
public class MwoBackendApplication {
    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
            put("domain-events:postgres:consume", ConsumePostgresDomainEventsCommand.class);
            put("domain-events:rabbitmq:consume", ConsumeRabbitMqDomainEventsCommand.class);
        }};
    }
}
