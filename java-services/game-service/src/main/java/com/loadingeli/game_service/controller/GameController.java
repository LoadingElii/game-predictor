package com.loadingeli.game_service.controller;

import com.loadingeli.game_service.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/game")
public class GameController {

    @Autowired
    public GameController(GameService gameService) {
    }

}
