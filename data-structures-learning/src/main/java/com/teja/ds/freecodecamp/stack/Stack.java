package com.teja.ds.freecodecamp.stack;

import java.util.LinkedList;

public class Stack<T> {

    private final LinkedList<T> list = new LinkedList<>();

    public Stack(){}

    public Stack(T elem){
        push(elem);
    }

    public void push(T elem){
        list.addLast(elem);
    }

    public T pop(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.removeLast();
    }

    public T peek(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return list.peekLast();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
