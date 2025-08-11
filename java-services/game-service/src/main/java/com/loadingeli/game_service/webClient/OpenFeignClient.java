package com.loadingeli.game_service.webClient;

import com.loadingeli.game_service.entity.GameDTO;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "NFL-Data", url = "")
public class OpenFeignClient {

    public void /*List<GameDTO>*/ getAllGamesByWeek(Integer week){
    }

    public void /*List<GameDTO>*/ getGamesByTeam(String team){
    }

    public void /*GameDTO*/ getGameByTeam(String team){
    }

}
