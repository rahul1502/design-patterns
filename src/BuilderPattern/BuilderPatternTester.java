package BuilderPattern;

public class BuilderPatternTester {

    public void test() {

        System.out.println("    Build Old Robot");

        // I want to create a RobotBuilder and to build the robot,
        // use the OldRobotBuilder blueprint (because I want to make an old robot)
        RobotBuilder oldRobotBuilder = new OldRobotBuilder();

        // pass the oldRobotBuilder blueprint specifications to the RobotEngineer,
        // so that the RobotEngineer uses that blueprint to make a robot
        RobotEngineer oldRobotEngineer = new RobotEngineer(oldRobotBuilder);

        // ask the RobotEngineer to make the robot
        oldRobotEngineer.makeRobot();

        // get the robot made by RobotEngineer
        Robot mrOldieBot = oldRobotEngineer.getRobot();

        System.out.println("        Robot Built: [MrOldieBot]");
        System.out.println("        Robot Head: " + mrOldieBot.getRobotHead());
        System.out.println("        Robot Torso: " + mrOldieBot.getRobotTorso());
        System.out.println("        Robot Arms: " + mrOldieBot.getRobotArms());
        System.out.println("        Robot Legs: " + mrOldieBot.getRobotLegs());

        // Just like that, build a FighterRobot
        System.out.println("    Build Fighter Robot");

        RobotBuilder fighterRobotBuilder = new FighterRobotBuilder();
        RobotEngineer fighterRobotEngineer = new RobotEngineer(fighterRobotBuilder);
        fighterRobotEngineer.makeRobot();
        Robot mrGutsy = fighterRobotEngineer.getRobot();

        System.out.println("        Robot Built: [MrGutsy]");
        System.out.println("        Robot Head: " + mrGutsy.getRobotHead());
        System.out.println("        Robot Torso: " + mrGutsy.getRobotTorso());
        System.out.println("        Robot Arms: " + mrGutsy.getRobotArms());
        System.out.println("        Robot Legs: " + mrGutsy.getRobotLegs());

    }
}
