package BuilderPattern;

public class OldRobotBuilder implements RobotBuilder {

    Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Hook Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
