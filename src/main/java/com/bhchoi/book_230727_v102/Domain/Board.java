package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_id")
    private Integer boardId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="board_title")
    private String boardTitle;

    @Column(name="board_content")
    private String boardContent;

    @Column(name="board_category")
    private String boardCategory;

    @Column(name = "write_date")
    private Date writeDate;

    @Column(name="update_date")
    private Date updateDate;

    @Column(name = "delete_date")
    private Date deleteDate;

    @Builder
    public Board(Integer boardId, User user, String boardTitle, String boardContent, String boardCategory, Date writeDate, Date updateDate, Date deleteDate) {
        this.boardId = boardId;
        this.user = user;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardCategory = boardCategory;
        this.writeDate = writeDate;
        this.updateDate = updateDate;
        this.deleteDate = deleteDate;
    }
}
