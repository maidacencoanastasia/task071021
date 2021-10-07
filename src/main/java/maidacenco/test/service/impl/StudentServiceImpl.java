package maidacenco.test.service.impl;

import maidacenco.test.model.Student;
import maidacenco.test.repository.StudentRepository;
import maidacenco.test.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
