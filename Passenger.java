public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    // public void boardCar(Car c) can call c.addPassenger(this) to board a given car 
    // but if car is full should catch the exception thrown by c.addPassenger
    /* description: boardCar method to add person to Car
     * param: uses c.addPassenger to check if Car is at capacity
     * returns: adds a person to the car (if there's space)
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // public void getOffCar(Car c) can call c.removePassenger(this) to get off a given 
    // car if passenger isn't on board, should catch exception thrown by c.removePassenger
    /* description: getOffCar method to remove person from Car
     * param: uses removePassenger from Car class to check if person is in the car
     * returns: removes a person from the car (if they're there)
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
