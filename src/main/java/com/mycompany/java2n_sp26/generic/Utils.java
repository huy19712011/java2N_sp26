package com.mycompany.java2n_sp26.generic;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {

        return (first.compareTo(second) < 0) ? second : first;
    }
}
