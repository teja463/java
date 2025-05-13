# RabbitMQ

## Basic Sender and Receiver

- Run the Sender and Receiver in sendreceive in the intellij as Main programs to see the message sending and receiving

## Custom Acknowledgment, Durability, Persistent

- Run the Sender in the customack package via intellij
- Goto the root of the rabbitmq project and open two terminal windows to simulate two consumers
- Run `java -cp ".;.\lib\amqp-client-5.25.0.jar;.\lib\slf4j-api-1.7.36.jar" .\src\main\java\com\teja\practice\customack\Receiver.java` to receive the messages
- After receiving first message on both clients press Ctrl + C on one client and see the messages being routed to the other client
- This was possible because we are sending ack flag as false when we receive the message and acknowledging it as true in the finally block only after processing the message
- You can make the queue as durable just pass the flag as true when creating the queue
- You can also persist the messages in the queue for this pass the publishMessage method pass the required prop

## Publisher & Subscriber

- In this mode  we dont publish messages to a Queue instead we publish it to a Exchange
- Any number of queues can be subscribed to that exchange
- All the subscried  queues will receive the message
- Run the Publisher from intellij
- To simulate multiple subscribers open two command prompts and execute ` java -cp ".;.\lib\amqp-client-5.25.0.jar;.\lib\slf4j-api-1.7.36.jar" .\src\main\java\com\teja\practice\pubsub_fanout\Subscriber.java
  `
- 