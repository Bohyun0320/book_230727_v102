package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Book;
import com.bhchoi.book_230727_v102.Domain.Category;
import com.bhchoi.book_230727_v102.Domain.Reply;
import com.bhchoi.book_230727_v102.Domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter
@ToString
@NoArgsConstructor
public class ReplyDto {

    private Integer replyId;
    private Book book;
    private User user;
    private Category category;
    private String replyContent;
    private Date writeDate;
    private Date updateDate;
    private Boolean confirmYn;

    public Reply toEntity(){
        Reply build = Reply.builder()
                .replyId(replyId)
                .book(book)
                .user(user)
                .category(category)
                .replyContent(replyContent)
                .writeDate(writeDate)
                .updateDate(updateDate)
                .confirmYn(confirmYn)
                .build();
        return build;
    }

    @Builder
    public ReplyDto(Integer replyId, Book book, User user, Category category, String replyContent, Date writeDate, Date updateDate, Boolean confirmYn) {
        this.replyId = replyId;
        this.book = book;
        this.user = user;
        this.category = category;
        this.replyContent = replyContent;
        this.writeDate = writeDate;
        this.updateDate = updateDate;
        this.confirmYn = confirmYn;
    }
}
