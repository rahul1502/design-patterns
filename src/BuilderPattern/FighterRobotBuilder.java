package BuilderPattern;

public class FighterRobotBuilder implements RobotBuilder {

    Robot robot;

    public FighterRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Fast Brain Processor");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Titanium Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Hammer Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Rocket Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
