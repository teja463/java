package com.teja.practice.temp;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Receiver {
    public static void main(String[] args) throws IOException, TimeoutException {
        String Q_NAME = "my_q";
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(Q_NAME, false, false, false, null);
        DeliverCallback callback  =  (consumerTag,delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println("Redeived "+message);
        };
        channel.basicConsume(Q_NAME, true, callback,  consumerTag -> {});
    }
}
