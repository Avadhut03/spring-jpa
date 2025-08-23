package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentRepository studentrepository;
    @Test
    public void testStudent(){
        List<Student> studentlist=studentrepository.findAll();
        System.out.println(studentlist);
    }
}
