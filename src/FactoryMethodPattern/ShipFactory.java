package FactoryMethodPattern;

public class ShipFactory {

    public Ship makeShip(String shipType) {

        Ship ship = null;
        if(shipType.equals("O")) {
            return new OrbiterShip();
        }
        else if (shipType.equals("L")) {
            return new LanderShip();
        }
        else {
            return null;
        }
    }

}
