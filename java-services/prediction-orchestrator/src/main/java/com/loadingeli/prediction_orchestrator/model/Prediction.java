package com.loadingeli.prediction_orchestrator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String homeTeam;
    private String awayTeam;
    private Double homeTeamOdds;
    private Double awayTeamOdds;

    public Prediction(String homeTeam, String awayTeam, Double homeTeamOdds, Double awayTeamOdds) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamOdds = homeTeamOdds;
        this.awayTeamOdds = awayTeamOdds;
    }

    public Prediction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Double getHomeTeamOdds() {
        return homeTeamOdds;
    }

    public void setHomeTeamOdds(Double homeTeamOdds) {
        this.homeTeamOdds = homeTeamOdds;
    }

    public Double getAwayTeamOdds() {
        return awayTeamOdds;
    }

    public void setAwayTeamOdds(Double awayTeamOdds) {
        this.awayTeamOdds = awayTeamOdds;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "id=" + id +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeamOdds=" + homeTeamOdds +
                ", awayTeamOdds=" + awayTeamOdds +
                '}';
    }


}
