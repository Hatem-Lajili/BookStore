package com.lajili.BookStore.controller;

import com.lajili.BookStore.entity.Book;
import com.lajili.BookStore.repository.BookRepository;
import com.lajili.BookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public Iterable<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        Book book = bookService.getBookById(id);
        return book;
    }

    @PostMapping
    public HttpStatus addBook(@RequestBody Book book){
        bookService.addBook(book);
        return HttpStatus.CREATED;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return HttpStatus.NO_CONTENT;
    }


}
