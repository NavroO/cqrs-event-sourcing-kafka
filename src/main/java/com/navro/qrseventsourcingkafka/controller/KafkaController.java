package com.navro.qrseventsourcingkafka.controller;

import com.navro.qrseventsourcingkafka.service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/sendMessage")
    public String sendMessage() {
        kafkaProducerService.sendMessage("Hello Kafka!"); // Wysyłanie wiadomości
        return "Message sent!";
    }
}
