package com.kumar.springbootrabbitmq.consumer;

import com.kumar.springbootrabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);



    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public  void  consumerJsonMessage(User user){
        LOGGER.info(String.format("received JSOn message -> %s", user.toString()));
    }
}
