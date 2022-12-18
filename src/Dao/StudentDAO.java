package Dao;

import Entity.Student;

import java.util.List;

public interface StudentDAO {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(String student_no);
    Student getStudent(String student_no);
}
