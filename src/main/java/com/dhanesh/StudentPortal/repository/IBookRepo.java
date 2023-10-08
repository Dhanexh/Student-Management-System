package com.dhanesh.StudentPortal.repository;

import com.dhanesh.StudentPortal.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
