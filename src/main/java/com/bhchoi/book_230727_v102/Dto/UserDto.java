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
    private Integer roleId;
    private String email;
    private String password;
    private String name;
    private String birthY;
    private String birthM;
    private String birthD;
    private Date registerDate;

    public UserDto(String email, String encPassword, Integer roleId) {
        this.email = email;
        this.password = encPassword;
        this.roleId = roleId;
    }

    public User toEntity(){
        User build = User.builder()
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
    public UserDto(Integer roleId, String email, String password, String name, String birthY, String birthM, String birthD, Date registerDate) {
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
