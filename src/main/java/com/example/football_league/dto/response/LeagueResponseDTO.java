package com.example.football_league.dto.response;

import com.example.football_league.model.League;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeagueResponseDTO {

    private Integer id;
    private String leagueName;
    private String season;

    public static LeagueResponseDTO fromModel(League league) {
        return LeagueResponseDTO.builder()
                .id(league.getId())
                .leagueName(league.getLeagueName())
                .season(league.getSeason())
                .build();
    }

}
