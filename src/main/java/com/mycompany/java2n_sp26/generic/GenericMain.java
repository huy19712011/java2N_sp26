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

        //22. with constraints2
//        CGenericListWithConstraints2<Integer> list22 = new CGenericListWithConstraints2<>(); // Integer
//        CGenericListWithConstraints2<Float> list22 = new CGenericListWithConstraints2<>(); // Float
        CGenericListWithConstraints2<String> list22 = new CGenericListWithConstraints2<>(); // String
//        CGenericListWithConstraints2<Student> list22 = new CGenericListWithConstraints2<>(); // Student => error, not Comparable

        //3.
        Student student1 = new Student(10);
        Student student2 = new Student(20);

        if (student1.compareTo(student2) < 0) {
            System.out.println("student1 < student2");
        } else if (student1.compareTo(student2) == 0) {
            System.out.println("student 1 = student 2");
        } else {
            System.out.println("student 1 > student 2");
        }

        // 4. Generic methods
        var max = Utils.max(1, 3);
        System.out.println(max);

        Student maxStudent = Utils.max(student1, student2);
        System.out.println(maxStudent);

        // 5. Multiple type parameters
        Utils.print(1, "value 1");

        System.out.println(new KeyValuePair("key 1", "value1"));

    }

}
