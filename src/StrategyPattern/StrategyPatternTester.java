package StrategyPattern;

public class StrategyPatternTester {

    public void test() {

        // Create a worker robot (which does not have fighting capability)
        // therefore its fightingCapability instance variable will be initialized to CanNotFight()
        Robot worker = new WorkerRobot();

        // Create a fighter robot (which has fighting ability)
        // therefore its fightingCapability instance variable will be initialized to CanFight()
        Robot fighter = new FighterRobot();

        // check their capabilities
        System.out.println("    Worker Robot: " + worker.tryToFight());
        System.out.println("    Fighter Robot: " + fighter.tryToFight());

        // let's change worker's fighting ability
        System.out.println("    Giving Worker robot the ability to fight...");
        worker.setFightingCapability(new CanFight());

        // now the worker can fight
        System.out.println("    Worker Robot: " + worker.tryToFight());
    }
}
