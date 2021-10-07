package maidacenco.test.controller;

import maidacenco.test.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


}
