package FactoryMethodPattern;

public abstract class Ship {

    private String name;
    private int engineCapacity;


    public void startShip() {
        System.out.println("    Ship [ " + name + " ]: STARTED");
    }

    public void stopShip() {
        System.out.println("    Ship [ " + name + " ]: STOPPED");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
