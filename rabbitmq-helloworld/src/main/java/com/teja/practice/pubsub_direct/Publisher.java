package com.teja.practice.pubsub_direct;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        String EXCHANGE_NAME = "direct_logs";
        ConnectionFactory factory = new ConnectionFactory();
        String[] levels = new String[]{"info", "warn", "error"};
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
            Random random = new Random();
            random.nextInt();
            for (int i = 1; i <= 100; i++) {
                String logLevel = levels[random.nextInt(0, 3)];
                String message = "Log " + i + " :" + logLevel;
                System.out.println("Sent " + message);
                Thread.sleep(500);
                channel.basicPublish(EXCHANGE_NAME, logLevel, null, message.getBytes());
            }

        } finally {
            System.out.println("Done");
        }
    }

}
