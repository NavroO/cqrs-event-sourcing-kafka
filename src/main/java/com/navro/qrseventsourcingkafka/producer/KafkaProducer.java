package com.navro.qrseventsourcingkafka.producer;

import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        String topic = "event-topic";
        kafkaTemplate.send(topic, message);
    }
}
