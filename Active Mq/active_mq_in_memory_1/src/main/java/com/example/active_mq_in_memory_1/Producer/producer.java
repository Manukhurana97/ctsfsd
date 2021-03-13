package com.example.active_mq_in_memory_1.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class producer {

    @Autowired
    public Queue queue;
    @Autowired
    public JmsTemplate jmsTemplate;

    @GetMapping("/{message}")
    public ResponseEntity<String> produceMessage(@PathVariable("message") String message) {
        jmsTemplate.convertAndSend(queue, message);
        return ResponseEntity.ok("public to queue");
    }

}
