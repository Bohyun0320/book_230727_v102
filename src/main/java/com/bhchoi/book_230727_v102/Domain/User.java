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
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "user_id")
    private Integer userId;

    @JoinColumn(name="role_id")
    private Integer roleId;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;

    @Column(name="birth_y")
    private String birthY;

    @Column(name="birth_m")
    private String birthM;

    @Column(name="birth_d")
    private String birthD;

    @Column(name="register_date")
    private Date registerDate;

    @Builder
    public User(Integer userId, Integer roleId, String email, String password, String name, String birthY, String birthM, String birthD, Date registerDate) {
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
