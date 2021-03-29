package StrategyPattern;

public class FighterRobot extends Robot {

    public FighterRobot() {
        super();

        fightingCapability = new CanFight();

    }
}
