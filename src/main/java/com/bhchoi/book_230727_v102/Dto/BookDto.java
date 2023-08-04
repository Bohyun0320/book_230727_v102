package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Book;
import com.bhchoi.book_230727_v102.Domain.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class BookDto {

    private Integer bookId;
    private Category category;
    private String bookTitle;
    private String bookWriter;
    private String bookImg;
    private String bookContent;

    public Book toEntity(){
        Book build = Book.builder()
                .bookId(bookId)
                .category(category)
                .bookTitle(bookTitle)
                .bookWriter(bookWriter)
                .bookImg(bookImg)
                .bookContent(bookContent)
                .build();
        return build;
    }

    @Builder
    public BookDto(Integer bookId, Category category, String bookTitle, String bookWriter, String bookImg, String bookContent) {
        this.bookId = bookId;
        this.category = category;
        this.bookTitle = bookTitle;
        this.bookWriter = bookWriter;
        this.bookImg = bookImg;
        this.bookContent = bookContent;
    }
}
