package com.mkyong.book.controller;

import com.mkyong.book.model.Book;
import com.mkyong.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book) {
        Book books = bookService.save(book);
        return books;
    }


    @GetMapping("/findByAuthor/{author}")
    public Page<Book> findByAuthor(@PathVariable String author) {
        Page<Book> books = bookService.findByAuthor(author,new PageRequest(0, 10));
        return books;

    }
}
