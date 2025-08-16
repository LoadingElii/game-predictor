package com.loadingeli.game_service.webClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "NFL-Data", url = "www.nflapi.com")
public interface OpenFeignClient {

    @GetMapping("/games")
    public void /*List<GameDTO>*/ getAllGamesByWeek(Integer week);

    @GetMapping("/teams")
    public void /*List<GameDTO>*/ getGamesByTeam(String team);

    @GetMapping("/week")
    public void /*GameDTO*/ getGameByTeam(String team);

}
