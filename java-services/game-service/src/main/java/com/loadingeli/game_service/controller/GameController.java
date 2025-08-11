package com.loadingeli.game_service.controller;

import com.loadingeli.game_service.entity.GameDTO;
import com.loadingeli.game_service.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("{week}")
    public void /*List<GameDTO>*/ getAllGamesForWeek(@PathVariable("week") Integer week){
        gameService.getAllGamesForWeek(week);
    }

    @GetMapping("/all/{team}")
    public void /*List<GameDTO>*/ getAllGamesForTeam(@PathVariable("team") String team){
        gameService.getAllGamesByTeam(team);
    }

    @GetMapping("/game/{team}")
    public void /*GameDTO*/ getGameForTeam(@PathVariable("team") String team){
        gameService.getGameByTeam(team);
    }

}
