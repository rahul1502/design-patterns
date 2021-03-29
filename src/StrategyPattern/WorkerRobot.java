package StrategyPattern;

public class WorkerRobot extends Robot {

    public WorkerRobot() {
        super();

        fightingCapability = new CanNotFight();

    }
}
