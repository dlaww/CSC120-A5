public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /* public void boardCar(Car c) can call c.addPassenger(this) to board a given car
    if car is full should catch the exception thrown by c.addPassenger
     * 
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
            this.currentPassengers.add(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /* public void getOffCar(Car c) can call c.removePassenger(this) to get off a given car
    if passenger isn't on board, should catch exception thrown by c.removePassenger
     * 
     */
}
