package com.dhanesh.StudentPortal.repository;

import com.dhanesh.StudentPortal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
