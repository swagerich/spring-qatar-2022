package com.erich.qatar.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String password;
    private String passwordConfirm;

}
