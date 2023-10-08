package com.dhanesh.StudentPortal.controller;

import com.dhanesh.StudentPortal.model.Course;
import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("courses")
    public String addCourses(@RequestBody List<Course> courses){
        return courseService.addCourses(courses);
    }

    @GetMapping("courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("course/{id}")
    public String updateCourse(@PathVariable Long id,@RequestBody String title,
                               @RequestBody String description, @RequestBody String duration){
        return courseService.updateCourse(id,title,description,duration);
    }

    @DeleteMapping("course/{id}")
    public String removeCourse(@PathVariable Long id){
        return courseService.removeCourse(id);
    }
}
