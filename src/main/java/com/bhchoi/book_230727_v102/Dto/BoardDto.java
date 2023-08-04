package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Board;
import com.bhchoi.book_230727_v102.Domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Getter @Setter
@ToString
@NoArgsConstructor
public class BoardDto {

    private Integer boardId;
    private User user;
    private String boardTitle;
    private String boardContent;
    private String boardCategory;
    private Date writeDate;
    private Date updateDate;
    private Date deleteDate;

    public Board toEntity(){
        Board build = Board.builder()
                .boardId(boardId)
                .user(user)
                .boardTitle(boardTitle)
                .boardContent(boardContent)
                .boardCategory(boardCategory)
                .writeDate(writeDate)
                .updateDate(updateDate)
                .deleteDate(deleteDate)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Integer boardId, User user, String boardTitle, String boardContent, String boardCategory, Date writeDate, Date updateDate, Date deleteDate) {
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
