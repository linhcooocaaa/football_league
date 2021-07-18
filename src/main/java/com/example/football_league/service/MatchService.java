package com.example.football_league.service;

import com.example.football_league.dto.request.MatchFilterRequestDTO;
import com.example.football_league.model.Match;

import java.util.List;

public interface MatchService {

    List<Match> getMatches(MatchFilterRequestDTO matchFilter);

}
