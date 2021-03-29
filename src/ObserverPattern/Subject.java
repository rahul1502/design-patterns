package ObserverPattern;


// this interface notifies all the registered observers about any data changes
public interface Subject {

    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();

}
