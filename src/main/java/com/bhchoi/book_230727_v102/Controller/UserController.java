package com.bhchoi.book_230727_v102.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/joinProc")
    public String test(@RequestBody String jsonData){
        System.out.println("request : "+jsonData);
        return "test";
    }
}
