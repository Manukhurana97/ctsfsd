package com.example.active_mq_standalone_2.Consumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class Consumer2 {

    @JmsListener(destination = "standalone.queue")
    public void consumer(String message){
        System.out.println("received message Consumer 2: "+ message);
    }

}
