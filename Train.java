public class Train {

    // private 'Engine' attribute marked with keyword final to indicate composition
    // ie: 'private final Engine engine'

    // private array list to keep track of all Car's currently attached

    // constructor 'public Train(FuelType fuelType, double fuelMax, int nCars, int maxCapacity)'
        // this initializes 'Engine' and 'Car' and stores them

    // accessors including
        // public Engine getEngine()
        // public Car getCar(int i) <- returns i'th car
        // public int getTotalCapacity() <- returns total capacity across all cars
        // public int seatsRemaining() <- returns # remaining open seats across all cars

    // public void printManifest() to print roster of all passengers on board

}
