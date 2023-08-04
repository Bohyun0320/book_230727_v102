package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Book;
import com.bhchoi.book_230727_v102.Domain.BookComment;
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
public class BookCommentDto {

    private Integer commentId;
    private Book book;
    private User user;
    private Category category;
    private String commentContent;
    private Date writeDate;
    private Date updateDate;

    public BookComment toEntity(){
        BookComment build = BookComment.builder()
                .commentId(commentId)
                .book(book)
                .user(user)
                .category(category)
                .commentContent(commentContent)
                .writeDate(writeDate)
                .updateDate(updateDate)
                .build();
        return build;
    }

    @Builder
    public BookCommentDto(Integer commentId, Book book, User user, Category category, String commentContent, Date writeDate, Date updateDate) {
        this.commentId = commentId;
        this.book = book;
        this.user = user;
        this.category = category;
        this.commentContent = commentContent;
        this.writeDate = writeDate;
        this.updateDate = updateDate;
    }
}
