package com.apocalypse.restrobot.Robot;

import com.apocalypse.restrobot.Survivor.SurvivorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RobotService {
    private final RobotRepository robotRepository;

    @Autowired
    public RobotService(RobotRepository robotRepository) {
        this.robotRepository = robotRepository;
    }

    public List<Robot> getRobot() {
        return robotRepository.findAll();

    }

    public void addNewRobot(Robot robot) {
        robotRepository.save(robot);    }
}
