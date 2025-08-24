package com.example.demo.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }
    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

}
