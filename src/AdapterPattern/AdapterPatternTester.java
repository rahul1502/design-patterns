package AdapterPattern;

public class AdapterPatternTester {

    public void test() {


        RoboticCook cook = new RoboticCook();

        RoboticCowboy cowboy = new RoboticCowboy();

        WorkerRobot robotAdapter = new RoboticCowboyAdapter(cowboy);

        System.out.println("    Robot Cowboy");
        cowboy.sitAround();
        cowboy.drinkBeer();
        cowboy.singSong("Country Roads, Take me Home");

        System.out.println("    Robot Cook");
        cook.scanForTask();
        cook.doTask();
        cook.getReward("Doughnut");

        System.out.println("    Robot with Adapter");
        robotAdapter.scanForTask();
        robotAdapter.doTask();
        robotAdapter.getReward("Tim-Bits");


    }
}
