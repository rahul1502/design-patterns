import AdapterPattern.AdapterPatternTester;
import BuilderPattern.BuilderPatternTester;
import FacadePattern.FacadePatternTester;
import FactoryMethodPattern.FactoryMethodPatternTester;
import ObjectPoolPattern.ObjectPoolPatternTester;
import ObserverPattern.ObserverPatternTester;
import PrototypePattern.PrototypePatternTester;
import SingletonPattern.SingletonPatternTester;
import StrategyPattern.StrategyPatternTester;

public class Main {


    public static void main(String[] args) {


        // DESIGN PATTERNS

        // FACTORY METHOD PATTERN
        System.out.println("-------- FACTORY METHOD PATTERN --------");
        (new FactoryMethodPatternTester()).test();
        System.out.println();

        // SINGLETON DESIGN PATTERN
        System.out.println("-------- SINGLETON PATTERN --------");
        (new SingletonPatternTester()).test();
        System.out.println();

        // PROTOTYPE PATTERN
        System.out.println("-------- PROTOTYPE PATTERN --------");
        (new PrototypePatternTester()).test();
        System.out.println();

        // BUILDER PATTERN
        System.out.println("-------- BUILDER PATTERN --------");
        (new BuilderPatternTester()).test();
        System.out.println();

        // OBJECT POOL PATTERN
        System.out.println("-------- OBJECT POOL PATTERN --------");
        (new ObjectPoolPatternTester()).test(); // TODO
        System.out.println();

        // FACADE PATTERN
        System.out.println("-------- FACADE PATTERN --------");
        (new FacadePatternTester()).test();
        System.out.println();

        // ADAPTER PATTERN
        System.out.println("-------- ADAPTER PATTERN --------");
        (new AdapterPatternTester()).test();
        System.out.println();

        // STRATEGY PATTERN
        System.out.println("-------- STRATEGY PATTERN --------");
        (new StrategyPatternTester()).test();
        System.out.println();

        // OBSERVER PATTERN
        System.out.println("-------- OBSERVER PATTERN --------");
        (new ObserverPatternTester()).test();
        System.out.println();

    }

}
