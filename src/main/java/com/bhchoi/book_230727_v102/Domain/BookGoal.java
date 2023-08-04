package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@NoArgsConstructor
@Table(name = "bookgoal")
public class BookGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private Integer goalId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "goal_count")
    private Integer goalCount;

    @Builder
    public BookGoal(Integer goalId, User user, Integer goalCount) {
        this.goalId = goalId;
        this.user = user;
        this.goalCount = goalCount;
    }
}
