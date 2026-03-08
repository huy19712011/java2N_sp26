package com.mycompany.java2n_sp26.generic;

public class GenericMain {

    public static void main(String[] args) {

        //1. Generict classes
        // int => Integer
        // float => Float
        // double => Double
        // boolean => Boolean
        CGenericList<Integer> list = new CGenericList<>();
        list.add(1); // boxing: int => Integer
        list.add(2);

        int number = list.get(0); // unboxing: Integer => int
        System.out.println(number);

        //2. with constraints
        CGenericListWithConstraints<Number> list2 = new CGenericListWithConstraints<>();
        list2.add(1); // Integer
        list2.add(2.2f); // Float
        System.out.println(list2.get(0)); // print 1
        System.out.println(list2.get(1)); // print 2.2

        //2. with constraints2
//        CGenericListWithConstraints2<Integer> list22 = new CGenericListWithConstraints2<>(); // Integer
//        CGenericListWithConstraints2<Float> list22 = new CGenericListWithConstraints2<>(); // Float
        CGenericListWithConstraints2<String> list22 = new CGenericListWithConstraints2<>(); // String
//        CGenericListWithConstraints2<Student> list22 = new CGenericListWithConstraints2<>(); // Student => error, not Comparable
    }

}
