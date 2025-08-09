package com.loadingeli.game_service.service;

import com.loadingeli.game_service.repository.GameRepository;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    public GameService(GameRepository gameRepository) {
    }
}
