package PrototypePattern;

public class CloneFactory {

    public Ship getClone(Ship ship) {
        return ship.makeCopy();
    }

}
