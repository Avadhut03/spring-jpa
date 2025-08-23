package com.example.demo.Controller;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @GetMapping
    public List<Student> getUsers(){
        return studentService.getAllUser();
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.saveUser(student);
    }
}
