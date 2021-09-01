package com.bookstore.backend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String category;
    private String image;

    public BookDTO toDTO(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setName(book.getName());
        bookDTO.setPrice(book.getPrice());
        bookDTO.setQuantity(book.getQuantity());
        bookDTO.setCategory(book.getCategory());
        bookDTO.setImage(book.getImage());
        return bookDTO;
    }
}
