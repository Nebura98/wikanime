package wikanime.shared.infrastructure.bus.event;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class KafkaDomainEventsProducer {
    private final Producer producer;

    @Autowired
    KafkaDomainEventsProducer(Producer producer) {
        this.producer = producer;
    }

//    @Bean
//    public CommandLineRunner CommandLineRunnerBean() {
//
//    }

}
