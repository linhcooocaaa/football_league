package com.example.football_league.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@Table(name = "league")
@Entity
@AllArgsConstructor
public class League {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "leagueName", nullable = false)
    private String leagueName;

    @Column(name = "season", nullable = false)
    private String season;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    private List<Team> teams;

    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    private List<Match> matches;

}
