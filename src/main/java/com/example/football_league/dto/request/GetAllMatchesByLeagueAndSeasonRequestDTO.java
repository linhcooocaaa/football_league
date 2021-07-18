package com.example.football_league.dto.request;

import lombok.Data;

@Data
public class GetAllMatchesByLeagueAndSeasonRequestDTO {

    private Integer leagueId;
    private String season;

}
