package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Role;
import com.bhchoi.book_230727_v102.Domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {

    private Integer userId;
    private Role roleId;
    private String email;
    private String password;
    private String name;
    private String birthY;
    private String birthM;
    private String birthD;
    private Date registerDate;

    public User toEntity(){
        User build = User.builder()
                .userId(userId)
                .roleId(roleId)
                .email(email)
                .password(password)
                .name(name)
                .birthY(birthY)
                .birthM(birthM)
                .birthD(birthD)
                .registerDate(registerDate)
                .build();
        return build;
    }

    @Builder
    public UserDto(Integer userId, Role roleId, String email, String password, String name, String birthY, String birthM, String birthD, Date registerDate) {
        this.userId = userId;
        this.roleId = roleId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.birthY = birthY;
        this.birthM = birthM;
        this.birthD = birthD;
        this.registerDate = registerDate;
    }
}
