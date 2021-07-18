package com.example.football_league.model;

import com.example.football_league.model.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "team")
@AllArgsConstructor
public class Team extends BaseEntity {

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private League league;

}
