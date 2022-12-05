package com.erich.qatar.Dto.Response;

import com.erich.qatar.Dto.DataTeam;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamResponse {

    private String status;
    @JsonProperty("data")
    private List<DataTeam> dataTeam;
}
