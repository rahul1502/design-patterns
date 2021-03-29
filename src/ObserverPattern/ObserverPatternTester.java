package ObserverPattern;

public class ObserverPatternTester {
    public void test() {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setAAPLPrice(120.00);
        stockGrabber.setTSLAPrice(900.00);
        stockGrabber.setAMZNPrice(3340.00);

        StockObserver observer2 = new StockObserver(stockGrabber);
        StockObserver observer3 = new StockObserver(stockGrabber);

        stockGrabber.setAAPLPrice(160.00);
        stockGrabber.setTSLAPrice(1300.00);
        stockGrabber.setAMZNPrice(1240.00);

        stockGrabber.unRegister(observer2);

        stockGrabber.setTSLAPrice(1500.00);

    }
}
