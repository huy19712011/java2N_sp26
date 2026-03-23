package com.mycompany.java2n_sp26.ass1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        Menu menu = new Menu(scanner, service);
        menu.show();
    }

}
