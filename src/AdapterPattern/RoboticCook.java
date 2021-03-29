package AdapterPattern;

import java.util.Random;

public class RoboticCook implements WorkerRobot {

    Random genrator = new Random();

    @Override
    public void scanForTask() {
        int taskImportance = genrator.nextInt(10) + 1;

        System.out.println("    [Task Found] importance of task: " + taskImportance);
    }

    @Override
    public void doTask() {
        int taskEfficiency = genrator.nextInt(10) + 1;

        System.out.println("    [Task Completer] efficiency: " + taskEfficiency);
    }

    @Override
    public void getReward(String song) {
        System.out.println("    [Robot Receives Reward] listens to song: "+ song);
    }
}
