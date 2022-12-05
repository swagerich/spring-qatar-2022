package com.erich.qatar.Service.Impl;

import com.erich.qatar.Dto.Response.LoginResponse;
import com.erich.qatar.Dto.Response.UserResponse;
import com.erich.qatar.Model.Login;
import com.erich.qatar.Model.User;
import com.erich.qatar.Service.UserService;
import com.erich.qatar.Util.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl extends Client implements UserService {


    public UserServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public UserResponse create(User user) {
        String url = baseURL + "/user";
        ResponseEntity<UserResponse> responseEntity = restTemplate.postForEntity(url, user, UserResponse.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        }
        throw new RuntimeException("Error user no encontrado!!");
    }

    @Override
    public LoginResponse login(Login login) {
        String url = baseURL + "/user/login";
        ResponseEntity<LoginResponse> loginResponse = restTemplate.postForEntity(url, login, LoginResponse.class);
        if (loginResponse.getStatusCode().is2xxSuccessful()) {
            return loginResponse.getBody();
        }
        throw new RuntimeException("Error al logearse!!");
    }

}
