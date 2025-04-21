package com.DemoSpringbootAppWithKafka.Springboot.app.with.Kafka.Controller;

import com.DemoSpringbootAppWithKafka.Springboot.app.with.Kafka.Service.kafkaProducer;
import org.apache.coyote.Response;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private kafkaProducer producer;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam String message){
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent  to Kafka");
    }
}
