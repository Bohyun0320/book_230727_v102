package com.bhchoi.book_230727_v102.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
