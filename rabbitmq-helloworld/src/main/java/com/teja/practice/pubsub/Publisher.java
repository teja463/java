package com.teja.practice.pubsub;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        String exchangeName = "logs";
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(exchangeName, "fanout");
            for (int i = 1; i <= 100; i++) {
                String message = "Log "+i;
                Thread.sleep(500);
                System.out.println("Sent " +message);
                channel.basicPublish(exchangeName, "", null, message.getBytes(StandardCharsets.UTF_8));
            }
        }finally {
            System.out.println("Done");
        }
    }
}
