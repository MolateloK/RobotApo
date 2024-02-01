package com.apocalypse.restrobot.Survivor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SurvivorRepository extends JpaRepository<Survivor, Long> {

}