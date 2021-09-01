package com.bookstore.backend.repository;

import com.bookstore.backend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends JpaRepository<Book, Long> {
}
