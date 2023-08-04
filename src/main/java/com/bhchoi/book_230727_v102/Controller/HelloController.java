package com.bhchoi.book_230727_v102.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/home")
    public String home(){
        return "스프링부트 서버 리턴, 홈";
    }

    @RequestMapping("/login")
    public String login(){
        return "스프링부트 서버 리턴, 로그인";
    }

    @RequestMapping("/user/join")
    public String join(){
        return "스프링부트 서버 리턴, 회원가입";
    }
}
