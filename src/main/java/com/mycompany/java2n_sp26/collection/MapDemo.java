package com.mycompany.java2n_sp26.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void show() {

        Customer c1 = new Customer("a", "email1");
        Customer c2 = new Customer("b", "email2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // 1. get(key)
        Customer customer = map.get("email1");
        System.out.println(customer);

        // 2. getOrDefault()
        Customer unknown = new Customer("Unknown", "");
        System.out.println(map.getOrDefault("email10", unknown));

        // 3. ContainsKey
        System.out.println(map.containsKey("e")); // false

        // 4. replace
        System.out.println(map);
        map.replace("email1", new Customer("a++", "email++"));
        System.out.println(map);

        // 5. Iterate
        //
        for (var key : map.keySet()) {

            System.out.println(key); // e1 e2
        }
        //
        for (var entry : map.entrySet()) {

            System.out.println(entry);
        }
        //
        for (var customer2: map.values()) {

            System.out.println(customer2);
        }

    }

}
