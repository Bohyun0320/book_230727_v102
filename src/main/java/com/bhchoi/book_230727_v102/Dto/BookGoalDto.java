package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.BookGoal;
import com.bhchoi.book_230727_v102.Domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class BookGoalDto {

    private Integer goalId;
    private User user;
    private Integer goalCount;

    public BookGoal toEntity(){
        BookGoal build = BookGoal.builder()
                .goalId(goalId)
                .user(user)
                .goalCount(goalCount)
                .build();
        return build;
    }

    @Builder
    public BookGoalDto(Integer goalId, User user, Integer goalCount) {
        this.goalId = goalId;
        this.user = user;
        this.goalCount = goalCount;
    }
}
