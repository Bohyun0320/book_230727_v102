package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Integer bookId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name="book_title")
    private String bookTitle;

    @Column(name = "book_writer")
    private String bookWriter;

    @Column(name = "book_img")
    private String bookImg;

    @Column(name = "book_content")
    private String bookContent;

    @Builder
    public Book(Integer bookId, Category category, String bookTitle, String bookWriter, String bookImg, String bookContent) {
        this.bookId = bookId;
        this.category = category;
        this.bookTitle = bookTitle;
        this.bookWriter = bookWriter;
        this.bookImg = bookImg;
        this.bookContent = bookContent;
    }
}
