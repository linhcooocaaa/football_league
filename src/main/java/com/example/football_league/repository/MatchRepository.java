package com.example.football_league.repository;

import com.example.football_league.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    @Query("SELECT match " +
            "FROM Match match " +
            "LEFT JOIN match.league league " +
            "LEFT JOIN league.country country " +
            "WHERE league.season = :season " +
            "AND country.id = :countryId")
    List<Match> findByCountryAndSeason(Integer countryId, String season);

    @Query("SELECT match " +
            "FROM Match match " +
            "LEFT JOIN match.league league " +
            "WHERE league.season = :season " +
            "AND league.id = :leagueId")
    List<Match> findByLeagueAndSeason(Integer leagueId, String season);

    @Query("SELECT match " +
            "FROM Match match " +
            "LEFT JOIN match.league league " +
            "LEFT JOIN match.homeTeam homeTeam " +
            "LEFT JOIN match.awayTeam awayTeam " +
            "WHERE (homeTeam.id = :teamId OR awayTeam.id = :teamId) " +
            "AND league.season = :season")
    List<Match> findByTeamAndSeason(Integer teamId, String season);

}
