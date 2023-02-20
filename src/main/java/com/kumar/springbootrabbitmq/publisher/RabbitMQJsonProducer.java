package com.kumar.springbootrabbitmq.publisher;

import com.kumar.springbootrabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProducer {
    private static  final Logger LOGGER =  LoggerFactory.getLogger(RabbitMQJsonProducer.class);
    @Value("${rabbitmq.exchange.name}")
    private  String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public  void  sendJSonMessage(User user){
        LOGGER.info(String.format("Json Message sent -> %s", user.toString()));
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
    }
}
