package com.example.demo.Controller;

import com.example.demo.Service.CourseService;
import com.example.demo.entity.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }
    @GetMapping
    public List<Course> getCourses(){
        return courseService.getAllCourse();
    }
    @PostMapping
    public Course saveCourse(@RequestBody  Course course){
        return courseService.saveCourse(course);
    }
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course){
            return courseService.updatedCourse(id,course);
    }
}
