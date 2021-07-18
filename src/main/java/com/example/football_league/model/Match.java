package com.example.football_league.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity
@Table(name = "match")
@AllArgsConstructor
public class Match {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @OneToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private League league;

    @Column(name = "score_on_half_time", nullable = false)
    private String scoreOnHalfTime;

    @Column(name = "score_on_full_time", nullable = false)
    private String scoreOnFullTime;

    @Column(name = "penalty_score", nullable = false)
    private String penaltyScore;

    @Column(name = "final_game_score", nullable = false)
    private String finalGameScore;

    @Column(name = "number_of_red_cards", nullable = false)
    private Integer numberOfRedCards;

    @Column(name = "number_of_yellow_cards", nullable = false)
    private Integer numberOfYellowCards;

    @Column(name = "number_of_corners", nullable = false)
    private Integer numberOfCorners;

    @Column(name = "number_of_faults")
    private Integer numberOfFaults;

    @Column(name = "number_of_free_kicks")
    private Integer numberOfFreeKicks;

    @Column(name = "number_of_player_exchanges")
    private Integer numberOfPlayerExchanges;

}
