package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
@NoArgsConstructor
@Table(name="bookcomment")
public class BookComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "write_date")
    private Date writeDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Builder
    public BookComment(Integer commentId, Book book, User user, Category category, String commentContent, Date writeDate, Date updateDate) {
        this.commentId = commentId;
        this.book = book;
        this.user = user;
        this.category = category;
        this.commentContent = commentContent;
        this.writeDate = writeDate;
        this.updateDate = updateDate;
    }
}
