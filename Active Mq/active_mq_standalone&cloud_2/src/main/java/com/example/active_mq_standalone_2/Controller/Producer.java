package com.example.active_mq_standalone_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;


@RestController
public class Producer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") String message){
        jmsTemplate.convertAndSend(queue, message);
        return "published successfully message: "+ message;
    }
}
