package com.example.football_league.controller;

import com.example.football_league.dto.request.GetAllMatchesByCountryAndSeasonRequestDTO;
import com.example.football_league.dto.request.GetAllMatchesByLeagueAndSeasonRequestDTO;
import com.example.football_league.dto.request.GetAllMatchesByTeamAndSeasonRequestDTO;
import com.example.football_league.dto.response.MatchResponseDTO;
import com.example.football_league.model.Match;
import com.example.football_league.service.MatchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping("/getAllMatchesByCountryAndSeason")
    public List<MatchResponseDTO> getAllMatchesByCountryAndSeason
            (@RequestBody GetAllMatchesByCountryAndSeasonRequestDTO getAllMatchesByCountryAndSeasonRequestDTO) {
        Integer countryId = getAllMatchesByCountryAndSeasonRequestDTO.getCountryId();
        String season = getAllMatchesByCountryAndSeasonRequestDTO.getSeason();
        List<Match> matches = matchService.findByCountryAndSession(countryId, season);
        return matches.stream()
                .map(MatchResponseDTO::fromModel)
                .collect(Collectors.toList());
    }

    @PostMapping("/getAllMatchesByLeagueAndSeason")
    public List<MatchResponseDTO> getAllMatchesByCountryAndSeason
            (@RequestBody GetAllMatchesByLeagueAndSeasonRequestDTO getAllMatchesByLeagueAndSeasonRequestDTO) {
        Integer leagueId = getAllMatchesByLeagueAndSeasonRequestDTO.getLeagueId();
        String season = getAllMatchesByLeagueAndSeasonRequestDTO.getSeason();
        List<Match> matches = matchService.findByLeagueAndSeason(leagueId, season);
        return matches.stream()
                .map(MatchResponseDTO::fromModel)
                .collect(Collectors.toList());
    }

    @PostMapping("/getAllMatchesByTeamAndSeason")
    public List<MatchResponseDTO> getAllMatchesByCountryAndSeason
            (@RequestBody GetAllMatchesByTeamAndSeasonRequestDTO getAllMatchesByTeamAndSeasonRequestDTO) {
        Integer teamId = getAllMatchesByTeamAndSeasonRequestDTO.getTeamId();
        String season = getAllMatchesByTeamAndSeasonRequestDTO.getSeason();
        List<Match> matches = matchService.findByTeamAndSeason(teamId, season);
        return matches.stream()
                .map(MatchResponseDTO::fromModel)
                .collect(Collectors.toList());
    }

}
