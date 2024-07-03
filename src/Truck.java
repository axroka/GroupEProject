/**
 * The Truck class extending from Vehicle represents a specific type of vehicle with daily rental rate.
 * It provides methods to initialize a Truck object and retrieve its daily rental rate.
 *
 * @author Jennifer, Aakriti, and DT
 * Created on 06/26/2024
 */
class Truck extends Vehicle<Truck>{

    /**
     * Constructs a Truck object with the specified make, model, and year.
     *
     * @param make  The make of the Truck
     * @param model The model of the Truck
     * @param year  The year of the Truck
     */
    public Truck (String make, String model, int year) {
        super(make, model, year);
    }

    /**
     * Retrieves the daily rental rate for the Truck.
     *
     * @return The daily rental rate for the Truck
     */
    @Override
    public double getDailyRate(){
        return 30.0;

    }
}