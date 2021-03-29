package PrototypePattern;

public class PrototypePatternTester {

    public void test() {

        CloneFactory shipMaker = new CloneFactory();

        // create first object
        OrbiterShip orbiterShipA = new OrbiterShip();

        // use the CloneFactory to create a clone of the first object
        OrbiterShip orbiterShipB = (OrbiterShip) shipMaker.getClone(orbiterShipA);

        // both objects are totally independent

        System.out.println("    orbiterShipA: " + orbiterShipA);
        System.out.println("    orbiterShipB: " + orbiterShipB);

        System.out.println("    orbiterShipA hash code: " + System.identityHashCode(orbiterShipA));
        System.out.println("    orbiterShipB hash code: " + System.identityHashCode(orbiterShipB));
    }
}
