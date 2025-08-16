package com.loadingeli.prediction_orchestrator.controller;

import com.loadingeli.prediction_orchestrator.model.PredictionDTO;
import com.loadingeli.prediction_orchestrator.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/prediction")
public class PredictionController {
    private final PredictionService predictionService;

    @Autowired
    public PredictionController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @GetMapping("/game")
    public /**PredictionDTO**/ void getPredictionForGame(String homeTeam, String awayTeam) {

    }
    @GetMapping("/games")
    public /**List<PredictionDTO>**/ void getPredictionsForGamesOfWeek(List<PredictionDTO> gamesByWeek) {

    }


}
