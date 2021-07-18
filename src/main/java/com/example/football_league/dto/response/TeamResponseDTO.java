package com.example.football_league.dto.response;

import com.example.football_league.model.Team;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TeamResponseDTO {

    private String id;
    private String name;

    public static TeamResponseDTO fromModel(Team team) {
        return TeamResponseDTO.builder()
                .id(team.getId().toString())
                .name(team.getTeamName())
                .build();
    }

}
