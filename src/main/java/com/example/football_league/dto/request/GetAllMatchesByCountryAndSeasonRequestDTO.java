package com.example.football_league.dto.request;

import lombok.Data;

@Data
public class GetAllMatchesByCountryAndSeasonRequestDTO {

    private Integer countryId;
    private String season;

}
