package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double AAPLPrice;
    private double TSLAPrice;
    private double AMZNPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unRegister(Observer o) {

        int observerIndex = observers.indexOf(o);

        System.out.println("    [Observer Unregistered] index: " + observerIndex);

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(AAPLPrice, TSLAPrice, AMZNPrice);
        }
    }


    public void setAAPLPrice(double AAPLPrice) {
        this.AAPLPrice = AAPLPrice;
        notifyObserver();
    }

    public void setTSLAPrice(double TSLAPrice) {
        this.TSLAPrice = TSLAPrice;
        notifyObserver();
    }

    public void setAMZNPrice(double AMZNPrice) {
        this.AMZNPrice = AMZNPrice;
        notifyObserver();
    }
}
