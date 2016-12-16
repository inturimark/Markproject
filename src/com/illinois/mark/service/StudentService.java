package com.illinois.mark.service;

import java.util.List;

import com.illinois.mark.model.Student;

public interface StudentService {

    public void addStudent(Student p);

    public List<Student> listStudents();

    public Student getStudentById(String id);

    public void removeStudent(String id);

    public void updateStudent(Student p);

}
