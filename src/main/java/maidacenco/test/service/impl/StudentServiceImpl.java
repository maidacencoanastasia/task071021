package maidacenco.test.service.impl;

import maidacenco.test.exception.ResourceNotFoundException;
import maidacenco.test.model.Student;
import maidacenco.test.repository.StudentRepository;
import maidacenco.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        Optional<Student> author = studentRepository.findById(id);
        if (author.isPresent()) {
            return author.get();
        } else {
            throw new ResourceNotFoundException("Id", "Student", id);
        }
    }




}
