package com.teja.practice.sendreceive;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeoutException;

public class Sender {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Random random = new Random();
        try(Connection connection = factory.newConnection(); Channel channel = connection.createChannel()){
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            for(int i = 0; i< 10; i++){
                String message = "Hello World!!!" + random.nextInt(100);
                // simulating multiple users sending requests
                Thread.sleep(1000);
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println("[x] Sent '"+message+"'");
            }
        }
    }
}
