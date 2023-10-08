package com.dhanesh.StudentPortal.service;

import com.dhanesh.StudentPortal.model.Course;
import com.dhanesh.StudentPortal.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public String addCourses(List<Course> courses) {
        courseRepo.saveAll(courses);
        return "Courses added";
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String updateCourse(Long id, String title, String description, String duration) {
        Course course = courseRepo.findById(id).get();
        course.setTitle(title);
        course.setDescription(description);
        course.setDescription(duration);
        return "Course updated";
    }

    public String removeCourse(Long id) {
        courseRepo.deleteById(id);
        return "Course removed";

    }
}
