package com.mycompany.java2n_sp26.generic;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {

        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void print(K key, V value) {

        System.out.println(key + ":" + value);
    }

    public static void printStudent(Student student) {

        System.out.println(student);
    }

    public static void printStudentList(CGenericList<? extends Student> students) {
//    public static void printStudentList(CGenericList<? super Student> students) {

        // after wildcard extends => ok
        Student student = students.get(0);

        // adding to list => not oki
        // students.add(new Student(20));

        // change wildcart to super
        // get => not ok
        // add => ok
        //students.add(new Student(20));
        //students.add(new GoodStudent(30));

        // summary
        // get => extends
        // add => super
    }
}
