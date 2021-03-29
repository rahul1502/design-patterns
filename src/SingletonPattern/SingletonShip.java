package SingletonPattern;

public class SingletonShip {

    private static SingletonShip singleInstance = null;

    private String name;
    private int engineCapacity;

    // make the constructor private so that no other classes can create an object of this class
    private SingletonShip() { }

    public static SingletonShip getInstance() {

        if(singleInstance == null) {
            singleInstance = new SingletonShip();
        }

        return singleInstance;
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
