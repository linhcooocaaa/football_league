package com.example.football_league.dto.response;

import com.example.football_league.model.League;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class LeagueResponseDTO {

    private String id;
    private String leagueName;
    private CountryResponseDTO country;
    private String season;

    public static LeagueResponseDTO fromModel(League league) {
        return LeagueResponseDTO.builder()
                .id(league.getId().toString())
                .leagueName(league.getLeagueName())
                .country(CountryResponseDTO.fromModel(league.getCountry()))
                .season(league.getSeason())
                .build();
    }

}
