package com.mycompany.java2n_sp26.generic;

public class GenericMain {

    public static void main(String[] args) {

        //1.
        // int => Integer
        // float => Float
        // double => Double
        // boolean => Boolean
        CGenericList<Integer> list = new CGenericList<>();
        list.add(1); // boxing: int => Integer
        list.add(2);

        int number = list.get(0); // unboxing: Integer => int
        System.out.println(number);
    }

}
