package AdapterPattern;

public class RoboticCowboyAdapter implements WorkerRobot {

    RoboticCowboy roboticCowboy;

    public RoboticCowboyAdapter(RoboticCowboy roboticCowboy) {
        this.roboticCowboy = roboticCowboy;
    }

    @Override
    public void scanForTask() {
        roboticCowboy.sitAround();
    }

    @Override
    public void doTask() {
        roboticCowboy.drinkBeer();
    }

    @Override
    public void getReward(String song) {
        roboticCowboy.singSong(song);
    }
}
