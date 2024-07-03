/**
 * The SUV class, extending Vehicle, represents a specific type of vehicle with daily rental rate.
 * It provides methods to initialize an SUV object and retrieve its daily rental rate.
 *
 * @author DT and Aakriti
 * Created on 06/26/2024
 */
class SUV extends Vehicle<SUV> {

    /**
     * Constructs an SUV object with the specified make, model, and year.
     *
     * @param make  The make of the SUV
     * @param model The model of the SUV
     * @param year  The year of the SUV
     */
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    /**
     * Retrieves the daily rental rate for the SUV.
     *
     * @return The daily rental rate for the SUV
     */
    @Override
    public double getDailyRate() {
        return 20.0;
    }
}
