package com.illinois.mark.dao;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.illinois.mark.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addStudent(Student student) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(student);
        logger.info("Student saved successfully, Student Details=" + student);
    }

    @Override
    public void updateStudent(Student student) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(student);
        logger.info("Student updated successfully, Student Details=" + student);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> listStudents() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Student> personsList = session.createQuery("from Student").list();
        for (Student p : personsList) {
            logger.info("Student List::" + p);
        }
        return personsList;
    }

    @Override
    public Student getStudentById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        try {
            Student p = (Student) session.load(Student.class, id);
            logger.info("Student loaded successfully, Student details=" + p);
            return p;
        } catch (ObjectNotFoundException objectNotFoundException) {
            return null;
        }
    }

    @Override
    public void removeStudent(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Student p = (Student) session.load(Student.class, id);
        if (null != p) {
            session.delete(p);
        }
        logger.info("Student deleted successfully, person details=" + p);
    }

}
