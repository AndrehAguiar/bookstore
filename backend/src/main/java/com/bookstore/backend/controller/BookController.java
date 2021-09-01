package com.bookstore.backend.controller;

import com.bookstore.backend.model.BookDTO;
import com.bookstore.backend.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/bookstore")
@AllArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<BookDTO> getBook(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getBookById(id));
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<Page<BookDTO>> getBooks() {
        return ResponseEntity.ok().body(service.getAllBooks());
    }

    @PostMapping("/")
    public ResponseEntity<BookDTO> createBook(@Valid @RequestBody BookDTO bookDTO) {
        return ResponseEntity.ok().body(service.saveBook(bookDTO));
    }

}
