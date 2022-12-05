package com.erich.qatar.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DataMatch {
    private Long id;

    private String type;

    private String group;

    @JsonProperty("home_team_id")
    private String homeTeamId;

    @JsonProperty("away_team_id")
    private String awayTeamId;

    @JsonProperty("home_score")
    private Integer homeScore;

    @JsonProperty("away_score")
    private Integer awayScore;

    /*@JsonProperty("home_scorers")
    private String homeScorers;

    @JsonProperty("away_scorers")
    private String awayScores;*/

    // @DateTimeFormat(pattern = "yyyy-MM-dd MM:SS")
    @JsonProperty("persian_date")
    private String persianDate;

    // @DateTimeFormat(pattern = "yyyy-MM-dd MM:SS")
    @JsonProperty("local_date")
    private String localDate;

    @JsonProperty("stadium_id")
    private String stadiumId;

    @JsonProperty("time_elapsed")
    private String timeElapsed;

    private boolean finished;

    private Integer matchday;

    @JsonProperty("home_team_fa")
    private String homeTeamFa;

    @JsonProperty("away_team_fa")
    private String awayTeamFa;

    @JsonProperty("home_team_en")
    private String homeTeamEn;

    @JsonProperty("away_team_en")
    private String awayTeamEn;

    @JsonProperty("home_flag")
    private String homeFlag;

    @JsonProperty("away_flag")
    private String awayFlag;


}
