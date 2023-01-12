package com.example.controller;

import com.example.dto.BookRequest;
import com.example.model.Book;
import com.example.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: BookController
 * author: gxs
 * Date: 2023/1/12  21:00
 */
@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;
/**
 * 添加读书
 * @param bookRequest
 * */
    @PostMapping
    public ResponseEntity<Void> addBook(@RequestBody BookRequest bookRequest) {
        Book book = new Book();
        book.setBookName(bookRequest.getBookName());
        book.setUserId(book.getUserId());
        book.setDescription(bookRequest.getDescription());
        book.setComment(bookRequest.getComment());
        book.setIcon(bookRequest.getIcon());
        bookService.save(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
