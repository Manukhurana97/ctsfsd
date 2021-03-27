package com.example.rabbitmq.Controller;

import com.example.rabbitmq.Config.Rabbitmqconfig;
import com.example.rabbitmq.Models.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = Rabbitmqconfig.Queue_name)
    public void ConsumeMessage(OrderStatus status){
        System.out.println("Receive order"+status.getMessage());
    }
}
