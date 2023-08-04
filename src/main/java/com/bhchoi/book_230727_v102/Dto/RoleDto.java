package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Role;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RoleDto {

    private Integer roleId;
    private String roleNm;

    public Role toEntity(){
        Role build = Role.builder()
                .roleId(roleId)
                .roleNm(roleNm)
                .build();
        return build;
    }

    @Builder
    public RoleDto(Integer roleId, String roleNm) {
        this.roleId = roleId;
        this.roleNm = roleNm;
    }
}
