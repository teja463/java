package com.teja.practice.pubsub_fanout;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Subscriber {
    public static void main(String[] args) throws IOException, TimeoutException {
        String exchangeName = "logs";
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT);
        String queue = channel.queueDeclare().getQueue();
        channel.queueBind(queue, exchangeName,"");

        DeliverCallback deliverCallback  = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println("Received "+message);
        };

        channel.basicConsume(queue,true, deliverCallback, consumerTag -> {});
    }
}
