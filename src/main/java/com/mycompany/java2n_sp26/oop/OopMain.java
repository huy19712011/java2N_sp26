package com.mycompany.java2n_sp26.oop;

import java.util.ArrayList;
import java.util.List;


public class OopMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList();

        Employee employee1 = new Employee(1, "employee 1", "email 1", "phone 1", 101);
        Employee employee2 = new Employee(2, "employee 2", "email 2", "phone 2", 102);
        Employee employee3 = new Employee(3, "employee 3", "email 3", "phone 3", 103);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(employees);

        for (int i = 0; i < employees.size(); ++i) {

            employees.get(i).info();
        }

        for (var empl: employees) {
            empl.info();
        }
    }

}
