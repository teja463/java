package com.teja.practice.pubsub_topic;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

public class Publisher {
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        String EXCHANGE_NAME = "topic_logs";
        ConnectionFactory factory = new ConnectionFactory();
        String[] topics = new String[]{"anonymous.info","anonymous.critical","kern.info" ,"kern.critical"};
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {

            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
            Random random = new Random();
            random.nextInt();
            for (int i = 1; i <= 100; i++) {
                String routeKey = topics[random.nextInt(0, 4)];
                String message = "Hello  " + i + " :" + routeKey;
                System.out.println("Sent " + message);
                Thread.sleep(500);
                channel.basicPublish(EXCHANGE_NAME, routeKey, null, message.getBytes());
            }

        } finally {
            System.out.println("Done");
        }
    }

}
