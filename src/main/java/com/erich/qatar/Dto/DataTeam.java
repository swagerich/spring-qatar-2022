package com.erich.qatar.Dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataTeam {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("name_en")
    private String nameEn;
    @JsonProperty("name_fa")
    private String nameTrue;
    private String flag;
    @JsonProperty("fifa_code")
    private String fifaCode;
    @JsonProperty("iso2")
    private String isoTwo;
    private String groups;
    @JsonProperty("id")
    private Long idd;
}
