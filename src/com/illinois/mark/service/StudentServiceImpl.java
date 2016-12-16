package com.illinois.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.illinois.mark.dao.StudentDAO;
import com.illinois.mark.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    @Transactional
    public void addStudent(Student p) {
        this.studentDAO.addStudent(p);
    }

    @Override
    @Transactional
    public void updateStudent(Student p) {
        this.studentDAO.updateStudent(p);
    }

    @Override
    @Transactional
    public List<Student> listStudents() {
        return this.studentDAO.listStudents();
    }

    @Override
    @Transactional
    public Student getStudentById(String id) {
        return this.studentDAO.getStudentById(id);
    }

    @Override
    @Transactional
    public void removeStudent(String id) {
        this.studentDAO.removeStudent(id);
    }

}
