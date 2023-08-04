package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.AdminCheck;
import jakarta.persistence.Column;
import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class AdminCheckDto {
    private Integer checkId;
    private String checkYn;

    public AdminCheck toEntity(){
        AdminCheck build = AdminCheck.builder()
                .checkId(checkId)
                .checkYn(checkYn)
                .build();
        return build;
    }

    @Builder
    public AdminCheckDto(Integer checkId, String checkYn) {
        this.checkId = checkId;
        this.checkYn = checkYn;
    }
}
