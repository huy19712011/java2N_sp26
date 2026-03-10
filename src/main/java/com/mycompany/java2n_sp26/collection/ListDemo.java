package com.mycompany.java2n_sp26.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {

    List<String> list = new ArrayList<>();

    // all methods from Collection interface
    list.add("A");
    list.add("B");
    list.add("C");
    System.out.println(list);

    //1. add at index
    list.add(0, "a");
    list.add(1, "b");
    System.out.println(list);

    //2. addAll
    Collections.addAll(list, "d", "e", "f");
    System.out.println(list);

    //3. get
    System.out.println(list.get(2)); // A

    //4. set
    list.set(2, "A + ");
    System.out.println(list.get(2));

    // 5. remove
    list.remove(0);
    System.out.println(list);

    // 6. indexOf()
    System.out.println(list.indexOf("B")); // if not found => return -1
    System.out.println(list.indexOf("B+")); // if not found => return -1

    // 7. lastIndexOf() => return last index of specific item

    // 8. subList(from, to)
    System.out.println(list.subList(0, 4));
    System.out.println(list);
    }


}
