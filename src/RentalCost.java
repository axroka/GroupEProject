 class RentalCost {
    public static double calculateRentalCost( Rentable rentable, int days) {
        return rentable.getDailyRate() * days;
    }
}