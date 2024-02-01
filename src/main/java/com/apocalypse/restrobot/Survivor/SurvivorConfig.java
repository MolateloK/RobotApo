package com.apocalypse.restrobot.Survivor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SurvivorConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            SurvivorRepository repository){
     return args -> {
       Survivor lindo=  new Survivor(
                 "lindo",
                 "female",
                 12
         );
         Survivor karabo=  new Survivor(
                 "karabo",
                 "male",
                 24
         );
         repository.saveAll(
                 List.of(lindo,karabo)
         );
     }  ;

    }
}
