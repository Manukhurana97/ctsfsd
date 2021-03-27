package com.example.rabbitmq.Controller;

import com.example.rabbitmq.Config.Rabbitmqconfig;
import com.example.rabbitmq.Models.OrderStatus;
import com.example.rabbitmq.Models.Orders;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Order")
public class Publisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;




    @GetMapping("/{name}")
    public String placeorder(@PathVariable(value = "name") String name, @RequestBody Orders order){
        order.setOrderid(UUID.randomUUID().toString());
        OrderStatus status = new OrderStatus(order,"BeingPrepared" , "Order plced successfully at "+name);
        rabbitTemplate.convertAndSend(Rabbitmqconfig.Topicname ,Rabbitmqconfig.Routingkey ,status);
        return "Placed Successfully at "+name;
    }

}
