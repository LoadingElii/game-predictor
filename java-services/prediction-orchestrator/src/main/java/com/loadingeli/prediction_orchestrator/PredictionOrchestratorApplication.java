package com.loadingeli.prediction_orchestrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PredictionOrchestratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PredictionOrchestratorApplication.class, args);
	}

}
