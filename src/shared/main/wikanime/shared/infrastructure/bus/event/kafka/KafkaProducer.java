package wikanime.shared.infrastructure.bus.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class KafkaProducer {
    @Value("${KAFKA_TOPIC}")
    private String KAFKA_TOPIC;

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String TOPIC, String key, String value) {
        ListenableFuture<SendResult<String, String>> future = (ListenableFuture<SendResult<String, String>>) kafkaTemplate.send(KAFKA_TOPIC, key, value);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                logger.info(String.format("Produced event to topic %s: key = %-10s value = %s", TOPIC, key, value));
            }

            @Override
            public void onFailure(Throwable ex) {
                ex.printStackTrace();
            }
        });
    }
}
