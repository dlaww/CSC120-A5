public class Engine {

    // private FuelType attribute to indicate what type of fuel is used, with doubles to store the 
    // current and maximum fuel levels with appropriate accessors for each
    private static String FuelType;
    double fuelAmount; 
    double maxFuel;

    // constructor to take initial values of attributes and set them appropriately
    /* description: Engine constructor
     * param: double stores current and max fuel level
     * returns: constructor takes initial values for each attribute and assigns them
     */
    public Engine(String FuelType, double fuelAmount, double maxFuel) {
        Engine.FuelType = FuelType;
        this.fuelAmount = fuelAmount;
        this.maxFuel = maxFuel;
    }

    // public void refuel method to reset current fuel level to the maxx
    /* description: public void refuel method
     * param: fuelAmount
     * return: resets engine current fuel level to max
     */
    public void refuel(double fuelAmount) {
        if (this.fuelAmount == this.maxFuel) { // Fuel already full
            throw new RuntimeException("Fuel at max");
        }
        this.fuelAmount = maxFuel;
        System.out.println("Sucessfully refueled");
    }

    // public void go method to decrease current fuel level and print current fuel level
    /* description: myEngine 'go' method
     * param: checks fuelAmount
     * return: decreases current fuel level and prints current fuel level
     * return: if no fuel, throws RuntimeException
     */
    public void go() {
        if (this.fuelAmount == 0) { // No fuel
            throw new RuntimeException("Engine has no fuel");
        }
        this.fuelAmount = fuelAmount - 1;
        System.out.println("Current fuel level is " + this.fuelAmount);
    }
    
    public static void main(String[] args) {
        Engine myEngine = new Engine("ELECTRIC", 100.0, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}