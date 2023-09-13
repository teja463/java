package com.teja.ds.freecodecamp.arrays;

public class Demo {

    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>(2);

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        System.out.println(array);

        array.remove(20);
        array.removeAt(2);
        System.out.println(array);
        array.add(60);
        array.add(70);
        array.add(80);
        System.out.println(array);

    }
}
