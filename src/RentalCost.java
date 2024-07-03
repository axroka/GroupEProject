/**
 * The RentalCost class provides methods to calculate rental costs based on the rental rate and optional car wash.
 * It includes methods to calculate rental costs with and without a car wash option.
 *
 * @author DT and Aakriti
 * Created on 06/26/2024
 */
class RentalCost {

    /**
     * Calculates the rental cost without a car wash option.
     *
     * @param rentable The Rentable object representing the vehicle to be rented
     * @param days The number of days the vehicle will be rented
     * @return The total rental cost without a car wash
     */
    public static double calculateRentalCost( Rentable rentable, int days) {
        return rentable.getDailyRate() * days;
    }

    /**
     * Calculates the rental cost with or without a car wash option.
     *
     * @param rentable The Rentable object representing the vehicle to be rented
     * @param days The number of days the vehicle will be rented
     * @param includeCarWash True if the customer opts for a car wash, false otherwise
     * @return The total rental cost, including a car wash fee if opted, or without if not opted
     */
    public static double calculateRentalCost(Rentable rentable , int days, boolean includeCarWash) {
        double originalCost = rentable.getDailyRate() * days;
        if (includeCarWash) {
            return originalCost + 10.0;
        } else {
            return originalCost;
        }
    }
}