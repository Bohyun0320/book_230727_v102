package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Book;
import com.bhchoi.book_230727_v102.Domain.BookNote;
import com.bhchoi.book_230727_v102.Domain.Category;
import com.bhchoi.book_230727_v102.Domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Getter @Setter
@ToString
@NoArgsConstructor
public class BookNoteDto {

    private Integer noteId;
    private User user;
    private Book book;
    private Category category;
    private String noteContent;
    private Date writeDate;
    private Date updateDate;
    private Float scope;

    public BookNote toEntity(){
        BookNote build = BookNote.builder()
                .noteId(noteId)
                .user(user)
                .book(book)
                .category(category)
                .noteContent(noteContent)
                .writeDate(writeDate)
                .updateDate(updateDate)
                .scope(scope)
                .build();
        return build;
    }

    @Builder
    public BookNoteDto(Integer noteId, User user, Book book, Category category, String noteContent, Date writeDate, Date updateDate, Float scope) {
        this.noteId = noteId;
        this.user = user;
        this.book = book;
        this.category = category;
        this.noteContent = noteContent;
        this.writeDate = writeDate;
        this.updateDate = updateDate;
        this.scope = scope;
    }
}
