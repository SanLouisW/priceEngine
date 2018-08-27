package com.test.app.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActionProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${cloudkarafka.topic.action}")
    private String topic;

    ActionProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(SampleMessage message) {
        this.kafkaTemplate.send(topic, message.getMessage());
        System.out.println("Sent sample message [" + message + "] to " + topic);
    }

}