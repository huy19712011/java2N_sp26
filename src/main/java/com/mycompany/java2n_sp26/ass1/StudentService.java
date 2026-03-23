package com.mycompany.java2n_sp26.ass1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    // 1. data
    private List<Student> students = new ArrayList();

    // 2b. methods
    // Them sv vao ds  add()
    public void addStudent(Student student) {

        students.add(student);
    }

    // Lay ra ds sv   getAll()
    public List<Student> getAllStudents() {

        //
        return students;
    }

    // Tim kiem sv theo id  getById()
    public Student findStudentById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Sua sv theo id  update()
    public boolean updateStudent(int id, String newName, int newAge) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                return true;
            }
        }
        return false;
    }

    // Xoa sv theo id  delete()
    public boolean removeStudent(int id) {

        return students.remove(findStudentById(id));
    }
}
