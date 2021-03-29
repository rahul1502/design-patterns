package StrategyPattern;

public interface Fights {

    String fight();

}

class CanFight implements Fights {

    @Override
    public String fight() {
        return "All Systems Go";
    }
}

class CanNotFight implements Fights {

    @Override
    public String fight() {
        return "Sorry I can not fight";
    }
}
