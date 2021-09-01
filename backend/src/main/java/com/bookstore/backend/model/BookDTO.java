package com.bookstore.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String category;
    private String image;

    public Book toEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setName(bookDTO.getName());
        book.setPrice(bookDTO.getPrice());
        book.setQuantity(bookDTO.getQuantity());
        book.setCategory(bookDTO.getCategory());
        book.setImage(bookDTO.getImage());
        return book;
    }
}
