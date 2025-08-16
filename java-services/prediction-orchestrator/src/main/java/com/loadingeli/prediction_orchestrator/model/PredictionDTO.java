package com.loadingeli.prediction_orchestrator.model;

public class PredictionDTO {
    private Long id;
    private String homeTeam;
    private String awayTeam;
    private Double homeTeamOdds;
    private Double awayTeamOdds;

    public PredictionDTO(Long id, String homeTeam, String awayTeam, Double homeTeamOdds, Double awayTeamOdds) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamOdds = homeTeamOdds;
        this.awayTeamOdds = awayTeamOdds;
    }

    public PredictionDTO(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public PredictionDTO() {
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
        return "PredictionDTO{" +
                "id=" + id +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeamOdds=" + homeTeamOdds +
                ", awayTeamOdds=" + awayTeamOdds +
                '}';
    }
}
