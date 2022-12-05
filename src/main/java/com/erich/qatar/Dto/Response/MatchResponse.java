package com.erich.qatar.Dto.Response;

import com.erich.qatar.Dto.DataMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MatchResponse {

    private String status;
    @JsonProperty("data")
    private List<DataMatch> dataMatch;
}
