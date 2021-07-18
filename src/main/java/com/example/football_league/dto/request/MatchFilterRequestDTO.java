package com.example.football_league.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchFilterRequestDTO {

    private String leagueId;
    private String countryId;
    private String season;
    private String teamId;

    public String getRedisKey() {
        return "" + leagueId + countryId + season + teamId;
    }

}
