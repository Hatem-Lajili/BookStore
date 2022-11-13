package com.lajili.BookStore.service;

import com.lajili.BookStore.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Iterable<Book> getBooks();

    Book getBookById(Long id);

    Book addBook(Book book);

    void deleteBook(Long id);
}
