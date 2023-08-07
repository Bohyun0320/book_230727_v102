package com.bhchoi.book_230727_v102.Controller;

import com.bhchoi.book_230727_v102.Dto.UserDto;
import com.bhchoi.book_230727_v102.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @RequestMapping("/user/joinProc")
    public String test(@RequestBody Map<String, String> jsonData){
        String email = jsonData.get("email");
        String rawPassword = jsonData.get("pw");
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        System.out.println(email+", "+encPassword);
        UserDto userDto = new UserDto(email, encPassword,1);
        userService.insert(userDto);
        return "test";
    }
}
