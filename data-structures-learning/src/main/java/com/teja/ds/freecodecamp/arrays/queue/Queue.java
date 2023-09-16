package com.teja.ds.freecodecamp.arrays.queue;

import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> list = new LinkedList<>();

    public Queue(){
    }

    public Queue(T elem){
        offer(elem);

    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void offer(T elem){
        list.addLast(elem);
    }

    public T poll(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.removeFirst();
    }

    public T peek(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.peekFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
