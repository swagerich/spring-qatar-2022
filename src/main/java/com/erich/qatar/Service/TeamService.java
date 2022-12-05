package com.erich.qatar.Service;

import com.erich.qatar.Dto.Response.TeamResponse;

public interface TeamService {

    TeamResponse findAll(String token);

    TeamResponse findById(Long id,String token);
}
