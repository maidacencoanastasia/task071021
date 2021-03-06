package maidacenco.test.controller;

import maidacenco.test.model.Student;
import maidacenco.test.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create REST API
    @PostMapping("")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    // get REST API
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // get  by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId) {
        return new ResponseEntity<Student>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    // update REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long studentId, @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.updateStudent(student, studentId), HttpStatus.OK);
    }

    // delete REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<String>("Student Successfully delete", HttpStatus.OK);
    }
}
