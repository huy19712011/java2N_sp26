package com.mycompany.java2n_sp26.generic;

public class CGenericList<T> {

//    private T[] items = new T[10]; // error

    private T[] items = (T[]) new Object[10];

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
