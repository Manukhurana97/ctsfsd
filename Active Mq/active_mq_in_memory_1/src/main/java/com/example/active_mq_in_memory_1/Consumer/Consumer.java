package com.example.active_mq_in_memory_1.Consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "inmemory.queue")
    public void getmessages(String message) {
        System.out.println("Message receive: " + message);

    }
}
