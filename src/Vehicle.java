//Parent code
/**
 * Vehicle abstract class represents a general vehicle in the Toyota Rental Store application.
 * This class provides the common properties and methods for all vehicle types.
 *
 * @author DT and Aakriti
 * Created on 06/26/2024
 *
 * @param <T> The type of the vehicle that extends this abstract class.
 */
abstract class Vehicle <T extends Vehicle<T>>implements Rentable<T> {
     private String make;
     private String model;
     private int year;

    /**
     * Constructor to initialize a Vehicle object.
     *
     * @param make  The make of the vehicle.
     * @param model The model of the vehicle.
     * @param year  The manufacturing year of the vehicle.
     */
     public Vehicle(String make, String model, int year) {

         /**
          * The make of the vehicle.
          */
         this.make = make;

         /**
          * The model of the vehicle.
          */
         this.model = model;

         /**
          * The manufacturing year of the vehicle.
          */
         this.year = year;
     }

    /**
     * Gets the make of the vehicle.
     *
     * @return The make of the vehicle.
     */
     public String getMake() {

         return make;
     }

    /**
     * Gets the model of the vehicle.
     *
     * @return The model of the vehicle.
     */
     public String getModel() {

         return model;
     }

    /**
     * Gets the manufacturing year of the vehicle.
     *
     * @return The manufacturing year of the vehicle.
     */
     public int getYear() {

         return year;
     }

    /**
     * Gets the daily rental rate for the vehicle.
     *
     * @return The daily rate for renting the vehicle.
     */
     @Override
     public abstract double getDailyRate();

    /**
     * Returns a string representation of the vehicle (make, model, and year).
     *
     * @return A string containing the make, model, and year of the vehicle.
     */
     public String toString() {
         return make + " " + model + " " + year;
     }
}


