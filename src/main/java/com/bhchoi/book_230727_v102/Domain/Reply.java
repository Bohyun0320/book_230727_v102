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
@Table(name="reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private Integer replyId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "reply_content")
    private String replyContent;

    @Column(name="write_date")
    private Date writeDate;

    @Column(name="update_date")
    private Date updateDate;

    @Column(name="confirm_yn")
    private Boolean confirmYn;

    @Builder
    public Reply(Integer replyId, Book book, User user, Category category, String replyContent, Date writeDate, Date updateDate, Boolean confirmYn) {
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
