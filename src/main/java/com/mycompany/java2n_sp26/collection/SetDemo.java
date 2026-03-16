package com.mycompany.java2n_sp26.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void show() {

        Set<String> set = new HashSet<>();

        //1. add: Note: order, duplicate
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("sky");
        System.out.println(set);

        //1.1 remove duplicate
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        set = new HashSet<>(collection); // reasign set here
        System.out.println(set);

        //2.
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // 2.1 Union
//        set1.addAll(set2);
//        System.out.println(set1); // a b c d

        // 2.2 Intersection
//        set1.retainAll(set2);
//        System.out.println(set1); // b c

        // 2.3 Difference
        set1.removeAll(set2);
        System.out.println(set1); //a


    }
}
