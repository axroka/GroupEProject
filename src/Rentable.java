/**
 * Rentable interface for defining the rental properties of a vehicle.
 * This interface specifies the method for obtaining the daily rental rate of a vehicle.
 *
 * @param <T> the type of vehicle that can be rented, extending the Vehicle class
 * @author DT and Aakriti
 * @version 1.0
 */
public interface Rentable<T extends Vehicle> {

    /**
     * Registers the daily rental rate for the vehicle.
     * The rate is used to calculate the total rental cost based on the number of rental days.
     *
     * @return the daily rental rate as a double
     */
    double getDailyRate();
}
