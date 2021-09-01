package com.bookstore.backend.service;

import com.bookstore.backend.model.Book;
import com.bookstore.backend.model.BookDTO;
import com.bookstore.backend.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    @Autowired
    private BookRepository repository;

    public BookDTO getBookById(Long id) {
        Book book = new Book();
        return book.toDTO(repository.getById(id));
    }

    public Page<BookDTO> getAllBooks() {
        return new PageImpl<>(repository.findAll().stream()
                .map(book -> book.toDTO(book)).collect(Collectors.toList()));
    }

    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = repository.save(bookDTO.toEntity(bookDTO));
        return book.toDTO(book);
    }
}
