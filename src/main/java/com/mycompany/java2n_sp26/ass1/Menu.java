package com.mycompany.java2n_sp26.ass1;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final StudentService service;

    public Menu(Scanner scanner, StudentService service) {
        this.scanner = scanner;
        this.service = service;
    }

    public void show() {
        int choice;
        do {
            printMenu();
            choice = getChoice();
            handleChoice(choice);
        } while (choice != 0);
    }

    private void printMenu() {
        System.out.println("\n==== Student Management ====");
        System.out.println("1. Show all students");
        System.out.println("2. Add new student");
        System.out.println("3. Update student");
        System.out.println("4. Remove student");
        System.out.println("5. Add studentIt");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void handleChoice(int choice) {
        scanner.nextLine(); // consume newline
        switch (choice) {
            case 1 ->
                showStudents();
            case 2 ->
                addStudent();
            case 3 ->
                updateStudent();
            case 4 ->
                removeStudent();
            case 0 ->
                System.out.println("Exiting program...");
            default ->
                System.out.println("Invalid choice, try again!");
        }
    }

    private void showStudents() {
        System.out.println("\n--- Student List ---");
        if (service.getAllStudents().isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : service.getAllStudents()) {
                System.out.println(s);
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        service.addStudent(new Student(id, name, age));
        System.out.println("Student added!");
    }


    private void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Age: ");
        int age = scanner.nextInt();

        if (service.updateStudent(id, name, age)) {
            System.out.println("Student updated!");
        } else {
            System.out.println("Student not found!");
        }
    }

    private void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = scanner.nextInt();
        if (service.removeStudent(id)) {
            System.out.println("Student removed!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
