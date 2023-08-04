package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name= "role")
public class Role {

    @Id
    @Column(name="role_id")
    private Integer roleId;

    @Column(name="role_nm")
    private String roleNm;

    @Builder
    public Role(Integer roleId, String roleNm) {
        this.roleId = roleId;
        this.roleNm = roleNm;
    }
}
