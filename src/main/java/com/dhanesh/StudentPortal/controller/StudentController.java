package com.dhanesh.StudentPortal.controller;

import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("students")
    public String addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("student/{id}")
    public String updateStudent(@PathVariable Long id,@RequestBody String name,
                                @RequestBody String age,@RequestBody String phoneNumber,
                                @RequestBody String branch, @RequestBody String department){
        return studentService.updateStudent(id,name,age,phoneNumber,branch,department);
    }

    @DeleteMapping("student/{id}")
    public String removeStudent(@PathVariable Long id){
        return studentService.removeStudent(id);
    }

}
