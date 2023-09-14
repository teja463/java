package com.teja.ds.freecodecamp.arrays;

import com.teja.ds.freecodecamp.linkedlist.DoubleLinkedList;

public class SingleLinkedList<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T>{
        T data;
        Node<T> next;
        public Node(T data,Node<T> next){
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void addFirst(T elem){
        if(isEmpty()){
            head = tail = new Node<>(elem, null);
        }else{
            var newNode = new Node<>(elem, head);
            head = newNode;
        }
        size++;
    }

    public void addLast(T elem){
        if(isEmpty()){
            head = tail = new Node<>(elem, null);
        }else{
            var newNode = new Node<>(elem, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst(){
        if(isEmpty()){
          throw new ArrayIndexOutOfBoundsException();
        }
        head = head.next;
        size--;
        if(isEmpty()){
            tail = null;
        }
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node<T> trav = head;
        while(trav!=null){
            str.append(trav.data).append(",");
            trav = trav.next;
        }
        str.append("]");
        return str.toString();
    }
}
