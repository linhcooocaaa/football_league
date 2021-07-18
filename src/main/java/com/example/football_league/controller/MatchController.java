package com.example.football_league.controller;

import com.example.football_league.dto.request.MatchFilterRequestDTO;
import com.example.football_league.dto.response.MatchResponseDTO;
import com.example.football_league.model.Match;
import com.example.football_league.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/matches")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService matchService;

    @GetMapping
    public List<MatchResponseDTO> getMatches(MatchFilterRequestDTO matchFilterRequestDTO) {
        List<Match> matches = matchService.getMatches(matchFilterRequestDTO);
        return matches.stream()
                .map(MatchResponseDTO::fromModel)
                .collect(Collectors.toList());
    }

}
