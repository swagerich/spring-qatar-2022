package com.erich.qatar.Service.Impl;

import com.erich.qatar.Dto.DataMatch;
import com.erich.qatar.Dto.Response.MatchResponse;
import com.erich.qatar.Service.MatchService;
import com.erich.qatar.Util.Client;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchServiceImpl extends Client implements MatchService {

    public MatchServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public MatchResponse findAll(String token) {
        String url = baseURL + "/match";
        HttpEntity<String> entity = new HttpEntity<>(buildAuthToken(token));
        ResponseEntity<MatchResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, MatchResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new RuntimeException("Oops,Error al obtener la lista de matches");
    }
}
