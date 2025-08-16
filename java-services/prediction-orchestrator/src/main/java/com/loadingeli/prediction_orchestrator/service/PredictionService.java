package com.loadingeli.prediction_orchestrator.service;

import com.loadingeli.prediction_orchestrator.repository.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {
    private final PredictionRepository predictionRepository;

    @Autowired
    public PredictionService(PredictionRepository predictionRepository) {
        this.predictionRepository = predictionRepository;
    }
}
