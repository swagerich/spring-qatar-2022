package com.erich.qatar.Controller;

import com.erich.qatar.Dto.Response.TeamResponse;
import com.erich.qatar.Service.Impl.TeamServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/team")
public class TeamController {
    private final TeamServiceImpl teamService;

    @GetMapping()
    public TeamResponse findAllTeam(@RequestHeader(name = "token") String token) {
        return teamService.findAll(token);
    }

    @GetMapping("/{id}")
    public TeamResponse findId(@PathVariable Long id, @RequestHeader(name = "token") String token) {
        return teamService.findById(id, token);
    }

}
