package com.dhanesh.StudentPortal.service;

import com.dhanesh.StudentPortal.model.Student;
import com.dhanesh.StudentPortal.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudents(List<Student> students) {
        studentRepo.saveAll(students);
        return "Students added";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public String updateStudent(Long id, String name, String age,
                                String phoneNumber, String branch, String department) {
        Student student = studentRepo.findById(id).get();
        student.setName(name);
        student.setAge(age);
        student.setPhoneNumber(phoneNumber);
        student.setBranch(branch);
        student.setDepartment(department);
        return "Student updated";
    }

    public String removeStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student removed";

    }
}
