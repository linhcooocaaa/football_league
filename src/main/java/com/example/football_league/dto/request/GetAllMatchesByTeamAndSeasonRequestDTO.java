package com.example.football_league.dto.request;

import lombok.Data;

@Data
public class GetAllMatchesByTeamAndSeasonRequestDTO {

    private Integer teamId;
    private String season;

}
