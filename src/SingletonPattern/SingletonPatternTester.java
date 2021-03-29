package SingletonPattern;

public class SingletonPatternTester {

    public void test() {


        SingletonShip singletonShip = SingletonShip.getInstance();

        singletonShip.setName("LoneWolf");
        singletonShip.setEngineCapacity(90);

        System.out.println("    [Singleton Ship Created]");
        System.out.println("    Instance ID: " + System.identityHashCode(singletonShip));
        System.out.println("    Name: " + singletonShip.getName());
        System.out.println("    Capacity: " + singletonShip.getEngineCapacity());

        // get instance of a SingletonShip object just to check if we are getting the same object of a new one
        SingletonShip newSingletonShip = SingletonShip.getInstance();

        System.out.println("    [Second Singleton Ship Created (not really)]");
        System.out.println("    Instance ID: " + System.identityHashCode(newSingletonShip)); // the instance-id will also be same
        // object instace variables are already set, even if we didn't explicitly set them
        System.out.println("    Name: " + newSingletonShip.getName());
        System.out.println("    Capacity: " + newSingletonShip.getEngineCapacity());



    }

}
