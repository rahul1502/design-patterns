package PrototypePattern;

public class OrbiterShip implements Ship {

    @Override
    public Ship makeCopy() {

        System.out.println("OrbiterShip is being made");

        Ship shipObject = null;

        try {
            shipObject = (Ship) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return shipObject;
    }

    public String toString() {
        return "OrbiterShip: All systems go";
    }
}
