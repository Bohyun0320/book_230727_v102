package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@NoArgsConstructor
@Table(name = "admincheck")
public class AdminCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_id")
    private Integer checkId;

    @Column(name="check_yn")
    private String checkYn;

    @Builder
    public AdminCheck(Integer checkId, String checkYn) {
        this.checkId = checkId;
        this.checkYn = checkYn;
    }
}
