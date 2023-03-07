import java.util.ArrayList;

public class Car {
/* description: private array list storing Passenger currently on board and int for car's max capacity
 * param: manifest - stores all the passengers in the current car
 * param: maxCapacity - the maximum capacity of the current train car
 */
    private ArrayList<Passenger> manifest;
    int maxCapacity;

/* description: constructor taking in the car's max capacity, initializing an appropriately sized array list
 * param: maxCapacity
 * returns: Car object
 */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.manifest = new ArrayList<Passenger>(maxCapacity);
    }

/* accessor-like methods 'public int getCapacity()' and 'public int seatsRemaining()' to return max seats and remaining seats
 * 
 */
    public int getCapacity() {
        System.out.println("Max number of seats " + maxCapacity);
        return maxCapacity;
    }

    public int seatsRemaining() {
        int seatsRemaining = maxCapacity - manifest.size();
        System.out.println("Number of seats remaining is " + seatsRemaining) ;
        return seatsRemaining;
    }

/* description: 'public void addPassenger(Passenger p)'
 * 
 */
    public void addPassenger(Passenger p) {
        if (this.manifest.size() < this.maxCapacity) {
            this.manifest.add(p);
        }
        System.out.println(p + " was successfully added to car");
        }

/* 'public void removePassenger(Passenger p)'
 * 
 */
    public void removePassenger(Passenger p) {
        if (!this.manifest.contains(p)) { // Not already in car
            throw new RuntimeException(p + " is not aboard train");
        }
        this.manifest.remove(p);
        System.out.println(p + " was sucessfully removed from train car");
        }

/* 'public void printManifest()' to print a list of all passengers aboard car or "This car is EMPTY"
 * 
 */
    public void printManifest() {
        if (this.manifest.size() == 0) {
            throw new RuntimeException("The car is EMPTY!");
        }
        System.out.println(this.manifest);
    }

}