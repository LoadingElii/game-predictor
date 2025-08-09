package com.loadingeli.game_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String homeTeam;
    private String awayTeam;
    private Integer homeScore;
    private Integer awayScore;
    private Date gameDate;


    public Game(String homeTeam, String awayTeam, Integer homeScore, Integer awayScore, Date gameDate) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.gameDate = gameDate;
    }


    public Game() {

    }


    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date GameDate) {
        gameDate = GameDate;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer AwayScore) {
        awayScore = AwayScore;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer HomeScore) {
        homeScore = HomeScore;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String AwayTeam) {
        awayTeam = AwayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String HomeTeam) {
        homeTeam = HomeTeam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        id = Id;
    }



    @Override
    public String toString() {
        return "Game{" +
                "Id=" + id +
                ", HomeTeam='" + homeTeam + '\'' +
                ", AwayTeam='" + awayTeam + '\'' +
                ", HomeScore=" + homeScore +
                ", AwayScore=" + awayScore +
                ", GameDate=" + gameDate +
                '}';
    }
}
