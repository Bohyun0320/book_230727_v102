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
@Table(name="booknote")
public class BookNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Integer noteId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name="note_content")
    private String noteContent;

    @Column(name = "write_date")
    private Date writeDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "scope")
    private Float scope;

    @Builder
    public BookNote(Integer noteId, User user, Book book, Category category, String noteContent, Date writeDate, Date updateDate, Float scope) {
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
