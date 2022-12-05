package com.erich.qatar.Service.Impl;

import com.erich.qatar.Dto.Response.TeamResponse;
import com.erich.qatar.Service.TeamService;
import com.erich.qatar.Util.Client;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamServiceImpl extends Client implements TeamService {

    public TeamServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public TeamResponse findAll(String token) {
        String url = baseURL + "/team";
        HttpEntity<String> entity = new HttpEntity<>(buildAuthToken(token));
        ResponseEntity<TeamResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, TeamResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new RuntimeException("Oops, Error al obtener los teams!");
    }


    @Override
    public TeamResponse findById(Long id, String token) {
        String url = baseURL + "/team/" + id;
        HttpEntity<String> entity = new HttpEntity<>(buildAuthToken(token));
        ResponseEntity<TeamResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, TeamResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new RuntimeException("Oops, Error al obtener el id del team");
    }
}
