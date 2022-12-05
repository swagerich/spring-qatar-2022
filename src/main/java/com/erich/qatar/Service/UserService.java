package com.erich.qatar.Service;

import com.erich.qatar.Dto.Response.LoginResponse;
import com.erich.qatar.Dto.Response.UserResponse;
import com.erich.qatar.Model.Login;
import com.erich.qatar.Model.User;

public interface UserService {
    UserResponse create(User user);
    LoginResponse login(Login login);

}
