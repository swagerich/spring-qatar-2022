package com.erich.qatar.Service;

import com.erich.qatar.Dto.DataMatch;
import com.erich.qatar.Dto.Response.MatchResponse;

public interface MatchService {

    MatchResponse findAll(String token);
}
