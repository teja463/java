package com.teja.ds.freecodecamp.linkedlist;

import com.teja.ds.freecodecamp.arrays.SingleLinkedList;

public class Demo {

    public static void main(String[] args) {
        singleDemo();
//        doubleDemo();
    }

    private static void singleDemo() {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        System.out.println(linkedList);

    }

    private static void doubleDemo() {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(30));
        System.out.println(linkedList.indexOf(50));
        linkedList.remove(10);
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeLast();
//        linkedList.clear();
        System.out.println(linkedList);
    }
}
