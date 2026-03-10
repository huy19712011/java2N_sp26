package com.mycompany.java2n_sp26.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {

    public static void show() {

        ArrayList<String> collection = new ArrayList<String>();

        // 1. add
        collection.add("A");
        collection.add("B");
        collection.add("C");

        //
        for (var item : collection) {

            System.out.println(item);
        }
        //
        System.out.println(collection);

        //2. addAll
        Collections.addAll(collection, "d", "e", "f");
        System.out.println(collection);

        //3. size()
        System.out.println(collection.size());

        //4. remove, clear
        //
        collection.remove("A");
        System.out.println(collection);
        //
        collection.remove(0);
        System.out.println(collection);
        // clear() to remove all
//        collection.clear();
//        System.out.println(collection);
//        System.out.println(collection.isEmpty());
        //5. contains()
        System.out.println(collection.contains("d")); //true
        System.out.println(collection.contains("D")); //false
        //6. convert to Array
        String[] toArray = collection.toArray(new String[0]); // auto detect number of items
        System.out.println(Arrays.toString(toArray));

        //7. compare 2 collections
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other); // false, 2 objects in memory
        System.out.println(collection.equals(other)); // true
    }
}
