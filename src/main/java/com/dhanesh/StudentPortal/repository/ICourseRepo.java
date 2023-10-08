package com.dhanesh.StudentPortal.repository;

import com.dhanesh.StudentPortal.model.Course;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
