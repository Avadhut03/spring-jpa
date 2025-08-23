package com.example.demo.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentrepository;
    public StudentService(StudentRepository studentrepository){
        this.studentrepository=studentrepository;
    }
    public List<Student> getAllUser(){
        return studentrepository.findAll();
    }
    public Student saveUser(Student student){
        return studentrepository.save(student);
    }
}
