package com.teja.ds.freecodecamp.linkedlist;

public class DoubleLinkedList<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T>{
        T data;
        Node<T> prev;
        Node<T> next;
        public Node(T data, Node<T> prev, Node<T> next){
            this.data = data;
            this.prev = prev;
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

    public void clear(){
        var trav = head;
        while(trav!=null){
            var temp = head.next;
            trav.next = null;
            trav.prev = null;
            trav.data = null;
            trav = temp;
        }
    }

    public void addFirst(T elem){
        if(isEmpty()){
            head = tail = new Node<>(elem, null , null);
        }else{
            var newNode = new Node<>(elem, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T elem){
        if(isEmpty()){
            head = tail = new Node<>(elem, null, null);
        }else{
            var newNode = new Node<>(elem, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(T elem){
        addLast(elem);
    }

    public T peekFirst(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return head.data;
    }

    public T peekLast(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return tail.data;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        head = head.next;
        size--;
        if(isEmpty()){
            tail = null;
        }else{
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        tail = tail.prev;
        size--;
        if(isEmpty()){
            head = null;
        }else{
            tail.next = null;
        }
    }

    private void remove(Node<T> node){
        if(node.prev == null){
            removeFirst();
        }
        if(node.next == null){
            removeLast();
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.data = null;
        node.next = null;
        node.prev = null;
        size--;
    }

    public boolean remove(T elem){
        var trav = head;
        while(trav!=null){
            if(trav.data.equals(elem)){
                remove(trav);
                return true;
            }
            trav = trav.next;
        }
        return false;
    }

    public int indexOf(T elem){
        Node<T> trav = head;
        int i = 0;
        while(trav!=null){
            if(trav.data.equals(elem)){
                return i;
            }else{
                trav = trav.next;
            }
            i++;
        }
        return -1;
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
