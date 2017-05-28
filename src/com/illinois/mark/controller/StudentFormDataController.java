package com.illinois.mark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.illinois.mark.model.Student;
import com.illinois.mark.service.StudentService;



@Controller
public class StudentFormDataController {
//hiiiii
    public static final String STUDENT_ID = "studentId";
    public static final String STUDENT_OBJECT = "studentObject";

    @Autowired
    private StudentService studentService;
////hiiii markbranch

    @RequestMapping("/AddStudent")
    public ModelAndView addStudent() {
    	//this is mark
    	//this is example 
        String message = "Add Student";
        ModelAndView modelAndView = new ModelAndView("AddStudentForm", "message", message);
        modelAndView.addObject(STUDENT_OBJECT, new Student());
        return modelAndView;
    }

    @RequestMapping("/AddStudentDetails")
    public ModelAndView addStudentDetails(@ModelAttribute Student studentObject) {
        studentService.addStudent(studentObject);
        String message = "Add Student Details Success";
        ModelAndView modelAndView = new ModelAndView("AddStudentDetailsSuccess", "message", message);
        modelAndView.addObject("student", studentObject);
        return modelAndView;
    }

    @RequestMapping("/StudentSearch")
    public ModelAndView displayStudent() {
        String message = "Student Search";
        ModelAndView modelAndView = new ModelAndView("StudentSearchForm", "message", message);
        modelAndView.addObject(STUDENT_ID, "");
        return modelAndView;
    }

    @RequestMapping("/StudentSearchDetails")
    public ModelAndView displayStudentDetails(@RequestParam("studentId") String studentId) {
        String message = "Student Search Details Success";
        ModelAndView modelAndView = new ModelAndView("StudentSearchDetailsSuccess", "message", message);
        Student studentObject = studentService.getStudentById(studentId);
        modelAndView.addObject(STUDENT_OBJECT, studentObject);
        modelAndView.addObject(STUDENT_ID, studentId);
        return modelAndView;
    }

    @RequestMapping("/PrintStudent")
    public ModelAndView printStudent() {
        String message = "PrintStudent";
        return new ModelAndView("StudentForm", "message", message);
    }

}
