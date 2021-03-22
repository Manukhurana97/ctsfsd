package com.example.active_mq_standalone_2.Config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;


import javax.jms.JMSException;
import javax.jms.Queue;

@Configuration
public class config {



//    @Value("tcp://localhost:61616")
    @Value("${spring.activemq.broker-url}")
    private String brokerurl;


    @Bean
    public Queue queuy(){
        return new ActiveMQQueue("standalone.queue");
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerurl);
        return activeMQConnectionFactory;
    }


    @Bean
    public JmsTemplate jmsTemplate(){
        return new JmsTemplate(activeMQConnectionFactory());
    }

//    ------------------------------------------------------------------------------------------------
//    for cloud

//    @Bean
//    public Queue queuy(){
//        return new ActiveMQQueue("standalone.queue");
//    }

}
