package com.apocalypse.restrobot.Survivor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/survivors")
public class SurvivorController {
private final SurvivorService survivorService;

@Autowired
public SurvivorController(SurvivorService survivorService) {
        this.survivorService = survivorService;
    }

    @GetMapping
    public List<Survivor>getSurvivor(){
       return survivorService.getSurvivor();
    }
   @PostMapping
    public void registerNewSurvivor(@RequestBody Survivor survivor){
    survivorService.addNewSurvivor(survivor);
    }

}
