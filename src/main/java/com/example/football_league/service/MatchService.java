package com.example.football_league.service;

import com.example.football_league.model.Match;
import com.example.football_league.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> findByCountryAndSession(Integer countryId, String season) {
        return matchRepository.findByCountryAndSeason(countryId, season);
    }

    public List<Match> findByLeagueAndSeason(Integer leagueId, String season) {
        return matchRepository.findByLeagueAndSeason(leagueId, season);
    }

    public List<Match> findByTeamAndSeason(Integer teamId, String season) {
        return matchRepository.findByTeamAndSeason(teamId, season);
    }

}
