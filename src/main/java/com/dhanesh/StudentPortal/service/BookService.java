package com.dhanesh.StudentPortal.service;

import com.dhanesh.StudentPortal.model.Book;
import com.dhanesh.StudentPortal.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBooks(List<Book> books) {
        bookRepo.saveAll(books);
        return "Books added";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updateBook(Long id, String title, String author,
                               String description, Integer price) {
        Book book = bookRepo.findById(id).get();
        book.setTitle(title);
        book.setAuthor(author);
        book.setDescription(description);
        book.setPrice(price);
        return "Book updated";
    }

    public String removeBook(Long id) {
        bookRepo.deleteById(id);
        return "Book removed";

    }
}
