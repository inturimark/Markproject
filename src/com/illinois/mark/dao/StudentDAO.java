package com.illinois.mark.dao;

import java.util.List;

import com.illinois.mark.model.Student;

public interface StudentDAO {

    public void addStudent(Student student);

    public void updateStudent(Student student);

    public List<Student> listStudents();

    public Student getStudentById(String id);

    public void removeStudent(String id);

}
