import java.util.ArrayList;

public class Train {

    // private 'Engine' attribute marked with keyword final to indicate composition
    // ie: 'private final Engine engine'
    private final Engine engine;
    int i;

    // private array list to keep track of all Car's currently attached
    private ArrayList<Train> car;

    // constructor 'public Train(FuelType fuelType, double fuelMax, int nCars, int maxCapacity)'
        // this initializes 'Engine' and 'Car' and stores them
    public Train(FuelType fuelType, double maxFuel, int nCars, int maxCapacity) {
        fuelType = FuelType.ELECTRIC;
        maxFuel = 100;
        nCars = 5;
        maxCapacity = 25;
    }

    // accessors including
        // public Engine getEngine()
        // public Car getCar(int i) <- returns i'th car
        // public int getTotalCapacity() <- returns total capacity across all cars
        // public int seatsRemaining() <- returns # remaining open seats across all cars

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return this.getCar(i);
    }

    public int getTotalCapacity() {
        return getCar(i).manifest.size();
    }

    public int seatsRemaining() {
        return getCar(i).seatsRemaining();
    }

    // public void printManifest() to print roster of all passengers on board
    public void printManifest() {
        return Car.manifest;
    }
}
