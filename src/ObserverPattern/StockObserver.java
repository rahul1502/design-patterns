package ObserverPattern;

public class StockObserver implements Observer {

    private double AAPLPrice;
    private double TSLAPrice;
    private double AMZNPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("[New Observer] id: " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double AAPLPrice, double TSLAPrice, double AMZNPrice) {
        this.AAPLPrice = AAPLPrice;
        this.TSLAPrice = TSLAPrice;
        this.AMZNPrice = AMZNPrice;

        printThePrice();
    }

    public void printThePrice() {
        System.out.println("    " + observerID + " [AAPL: " + AAPLPrice + " TSLA: " + TSLAPrice + " AMZN: " + AMZNPrice + "]");
    }
}
