package com.dhanesh.StudentPortal.controller;

import com.dhanesh.StudentPortal.model.Book;
import com.dhanesh.StudentPortal.model.Course;
import com.dhanesh.StudentPortal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("books")
    public String addBooks(@RequestBody List<Book> books){
        return bookService.addBooks(books);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("book/{id}")
    public String updateBook(@PathVariable Long id,@RequestBody String title,
                               @RequestBody String author, @RequestBody String description,
                               @RequestBody Integer price){
        return bookService.updateBook(id,title,author,description,price);
    }

    @DeleteMapping("book/{id}")
    public String removeBook(@PathVariable Long id){
        return bookService.removeBook(id);
    }
}
