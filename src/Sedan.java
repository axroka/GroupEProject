/**
 * The Sedan class represents a specific type of vehicle, Sedan, extending the Vehicle class.
 * It provides methods to initialize a Sedan object and retrieve its daily rental rate.
 *
 * @author DT and Aakriti
 * Created on 06/26/2024
 */
 class Sedan extends Vehicle<Sedan> {

    /**
     * Constructs a Sedan object with the specified make, model, and year.
     *
     * @param make The make of the Sedan
     * @param model The model of the Sedan
     * @param year The manufacturing year of the Sedan
     */
     public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    /**
     * Retrieves the daily rental rate for the Sedan.
     *
     * @return The daily rental rate for the Sedan
     */
    @Override
    public double getDailyRate() {
        return 15.0;
    }
}

