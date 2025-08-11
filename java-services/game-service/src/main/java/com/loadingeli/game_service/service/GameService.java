package com.loadingeli.game_service.service;

import com.loadingeli.game_service.repository.GameRepository;
import com.loadingeli.game_service.webClient.OpenFeignClient;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    private final OpenFeignClient openFeignClient;

    @Autowired
    public GameService(GameRepository gameRepository,
                       OpenFeignClient openFeignClient) {
        this.gameRepository = gameRepository;
        this.openFeignClient = openFeignClient;
    }

    public void getAllGamesForWeek(Integer week){
        openFeignClient.getAllGamesByWeek(week);
    }

    public void getAllGamesByTeam(String team) {
        openFeignClient.getGamesByTeam(team);
    }

    public void getGameByTeam(String team) {
        openFeignClient.getGameByTeam(team);
    }
}
