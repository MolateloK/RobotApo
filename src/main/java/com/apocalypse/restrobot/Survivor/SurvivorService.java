package com.apocalypse.restrobot.Survivor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurvivorService {

    private final SurvivorRepository survivorRepository;

    @Autowired
    public SurvivorService(SurvivorRepository survivorRepository) {
        this.survivorRepository = survivorRepository;
    }

    @Transactional
    public void updateSurvivorLocation(Location location) {
        System.out.println(location);
    }

    @Transactional
    public void addNewSurvivor(Survivor survivor) {
        survivorRepository.save(survivor);
    }

    public List<Survivor> getSurvivor() {
        return survivorRepository.findAll();

    }
    @Transactional
    public Survivor flagAsInfected(Long survivorId) {

        Survivor survivor = survivorRepository.findById(survivorId).
                orElseThrow(() -> new IllegalArgumentException("SURVIVOR NOT FOUND" + survivorId));

        return survivor;
    };
}

