package com.teja.ds.freecodecamp.queue;

public class Demo {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);

        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
