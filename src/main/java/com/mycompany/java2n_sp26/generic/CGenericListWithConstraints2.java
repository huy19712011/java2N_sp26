package com.mycompany.java2n_sp26.generic;

public class CGenericListWithConstraints2<T extends Comparable> {

    private T[] items = (T[]) new Comparable[10];

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
