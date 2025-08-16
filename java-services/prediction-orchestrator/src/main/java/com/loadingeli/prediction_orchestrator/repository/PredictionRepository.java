package com.loadingeli.prediction_orchestrator.repository;

import com.loadingeli.prediction_orchestrator.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<Prediction, Long> {
}
