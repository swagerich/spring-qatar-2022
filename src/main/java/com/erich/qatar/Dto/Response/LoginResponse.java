package com.erich.qatar.Dto.Response;

import com.erich.qatar.Dto.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String status;
    private String message;
    private Data data;
}
