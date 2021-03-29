package AdapterPattern;

import java.util.Random;

public class RoboticCowboy {

    Random generator = new Random();

    public void sitAround() {
        int numOfHrs = generator.nextInt(12) + 1;

        System.out.println("    [Sat around] number of hours: " + numOfHrs);
    }

    public void drinkBeer() {

        int numOfBeers = generator.nextInt(100) + 1;

        System.out.println("    [Drank Beer] number of Beers: " + numOfBeers);
    }

    public void singSong(String name) {

        System.out.println("    [Singing Song] name: " + name);
    }

}
