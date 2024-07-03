/**
 * Minivan class represents minivan vehicles stored in the Toyota Rental Store application.
 * This class extends the Vehicle class and provides a specific implementation for minivans.
 *
 * @author DT, Aakriti, and Jennifer
 * Created on 06/26/2024
 */
class Minivan extends Vehicle<Minivan> {

    /**
     * Constructor to initialize a Minivan object.
     *
     * @param make  The make of the minivan.
     * @param model The model of the minivan.
     * @param year  The manufacturing year of the minivan.
     */
    public Minivan(String make, String model, int year) {
        super(make, model, year);
    }

    /**
     * Gets the daily rental rate for the minivan.
     *
     * @return The daily rate for renting the minivan.
     */
    @Override
    public double getDailyRate(){
        return 40.0;
    }
}
