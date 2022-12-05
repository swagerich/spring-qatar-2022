package com.erich.qatar.Controller;

import com.erich.qatar.Dto.Response.LoginResponse;
import com.erich.qatar.Dto.Response.UserResponse;
import com.erich.qatar.Model.Login;
import com.erich.qatar.Model.User;
import com.erich.qatar.Service.Impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/copamundial")
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/register")
    public UserResponse regiserUser(@RequestBody User user){
        return  this.userService.create(user);
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody Login login){
        return this.userService.login(login);
    }
}
