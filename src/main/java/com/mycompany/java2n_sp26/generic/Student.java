package com.mycompany.java2n_sp26.generic;

public class Student implements Comparable<Student>{

    private int points;

    public Student(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Student other) {
        // this < other => -1
        // this == other => 0
        // this > other => +1

        //
//        if (points < other.points)
//            return -1;
//
//        if (points == other.points)
//            return 0;
//
//        return 1;

        //
        return points - other.points;
    }

    @Override
    public String toString() {
        return "Student{" + "points=" + points + '}';
    }


}
