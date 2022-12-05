package com.erich.qatar.Controller;

import com.erich.qatar.Dto.Response.MatchResponse;
import com.erich.qatar.Service.Impl.MatchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matches")
public class MatchController {

    private final MatchServiceImpl matchService;

    @GetMapping()
    public MatchResponse findAll(@RequestHeader(name = "token") String token) {
        return matchService.findAll(token);
    }
}
