package com.example.football_league.dto.response;

import com.example.football_league.model.Team;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamResponseDTO {

    private Integer id;
    private String name;

    public static TeamResponseDTO fromModel(Team team) {
        return TeamResponseDTO.builder()
                .id(team.getId())
                .name(team.getTeamName())
                .build();
    }

}
