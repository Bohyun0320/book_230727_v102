package com.bhchoi.book_230727_v102.Controller;

import com.bhchoi.book_230727_v102.Dto.UserDto;
import com.bhchoi.book_230727_v102.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @RequestMapping("/user/joinProc")
    public String test(@RequestBody Map<String, String> jsonData){
        Integer roleId = 1;
        String email = jsonData.get("email");
        String rawPassword = jsonData.get("pw");
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        String name = jsonData.get("name");
        String birthY = jsonData.get("birthY");
        String birthM = jsonData.get("birthM");
        String birthD = jsonData.get("birthD");
        LocalDateTime nowDate = LocalDateTime.now();
        UserDto userDto = new UserDto(roleId, email, encPassword, name,birthY, birthM, birthD, nowDate);
        userService.insert(userDto);
        return "test";
    }
}
