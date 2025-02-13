package com.navro.qrseventsourcingkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {
    @KafkaListener(topics = "event-topic", groupId = "group-id")
    public void consume(String message) {
        System.out.println("Recevied message: " + message);
    }
}
