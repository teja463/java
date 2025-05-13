package com.teja.practice.pubsub_topic;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class AllLogsReceiver {
    public static void main(String[] args) throws IOException, TimeoutException {
        String EXCHANGE_NAME = "topic_logs";
        ConnectionFactory factory = new ConnectionFactory();

        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);

        String queue = channel.queueDeclare().getQueue();
        channel.queueBind(queue,EXCHANGE_NAME, "#");
        DeliverCallback callback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println("Received "+message+" on route "+delivery.getEnvelope().getRoutingKey());
        };
        channel.basicConsume(queue, true, callback, consumerTag -> {});
    }
}
