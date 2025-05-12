package com.teja.practice.temp;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Sender {
    public static void main(String[] args) throws IOException, TimeoutException {
        String Q_NAME = "my_q";
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(Q_NAME, false, false, false, null);
            for (int i = 1; i <= 5; i++) {
                String message = "Hello "+i;
                System.out.println("Sent "+ message);
                channel.basicPublish("", Q_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            }
        } finally {
            System.out.println("Done");
        }
    }
}
