package com.springProjects.libararyManagementSystem.controller;

import com.springProjects.libararyManagementSystem.model.Book;
import com.springProjects.libararyManagementSystem.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    BookService bookService;
    @PostMapping
    public String addBook(@RequestBody Book book) throws Exception{
        return bookService.addBook(book);
    }
}