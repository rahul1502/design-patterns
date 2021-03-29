package FactoryMethodPattern;

public class FactoryMethodPatternTester {

    public void test() {


        // Create an object of the Factory class
        ShipFactory shipFactory = new ShipFactory();

        // create an Orbiter ship using the factory object
        Ship orbiterShip = shipFactory.makeShip("O");

        System.out.println("    [Orbiter Ship Created]");
        System.out.println("    Name: " + orbiterShip.getName());
        System.out.println("    Capacity: " + orbiterShip.getEngineCapacity());

        orbiterShip.startShip();
        orbiterShip.stopShip();

        // create a Lander ship using the factory object
        Ship landerShip = shipFactory.makeShip("L");

        System.out.println("    [Lander Ship Created]");
        System.out.println("    Name: " + landerShip.getName());
        System.out.println("    Capacity: " + landerShip.getEngineCapacity());

        landerShip.startShip();
        landerShip.stopShip();





    }

}
