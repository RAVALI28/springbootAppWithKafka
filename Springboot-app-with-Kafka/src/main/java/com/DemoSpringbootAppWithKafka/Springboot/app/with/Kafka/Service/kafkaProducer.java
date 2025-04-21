package com.DemoSpringbootAppWithKafka.Springboot.app.with.Kafka.Service;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.tcp.reactor.AbstractNioBufferReactorNettyCodec;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "my-topic";

    public void sendMessage(String message){
        kafkaTemplate.send(TOPIC, message);
    }
}
