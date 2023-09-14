package com.teja.ds.freecodecamp.arrays;

@SuppressWarnings("unchecked")
public class DynamicArray <T>{

    private T [] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArray(){
        this(16);
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        arr = (T []) new Object[capacity];
    }

    public int size(){
        return len;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T elem){
        arr[index] = elem;
    }

    public void clear(){
        for(int i =0; i< len; i++){
            arr[i] = null;
        }
    }

    public void add(T elem){
        if(len >= capacity){
            if(capacity == 0) {
                capacity = 1;
            }else{
                capacity = capacity * 2;
            }
            T [] newArr = (T[])new Object[capacity];
            for(int i =0; i<len; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[len++] = elem;
    }

    public T removeAt(int index){
        if(index < 0 || index>=len){
            throw new ArrayIndexOutOfBoundsException();
        }
        T data = arr[index];
        T [] newArr = (T[])new Object[len - 1];
        for(int i =0, j=0; i<len; i++, j++){
            if(i == index){
                j--;
            }else{
                newArr[j] = arr[i];
            }
        }
        arr = newArr;
        capacity = --len;
        return data;
    }

    public boolean remove(T elem){
        for(int i =0; i< len; i++){
            if(arr[i].equals(elem)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(T elem){
        for(int i =0; i< len; i++){
            if(arr[i].equals(elem))
                return i;
        }
        return -1;
    }

    public boolean contains(T elem){
        return indexOf(elem) != -1;
    }

    @Override
    public String toString() {
        if(size()<=0){
            return "";
        }
        StringBuilder str = new StringBuilder("[");
        for(int i=0;i<len-1; i++){
            str.append(arr[i]).append(",");
        }
        str.append(arr[len-1]).append("]");
        return str.toString();
    }
}
