package StrategyPattern;

public class Robot {

    private String name;
    private int weight;

    public Fights fightingCapability;

    public String tryToFight() {
        return fightingCapability.fight();
    }

    public void setFightingCapability(Fights fightingCapability) {
        this.fightingCapability = fightingCapability;
    }
}
