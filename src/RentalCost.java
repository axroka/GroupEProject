 class RentalCost {
    public static double calculateRentalCost( Rentable rentable, int days) {
        return rentable.getDailyRate() * days;
    }
    public static double calculateRentalCost(Rentable rentable , int days, boolean includeCarWash) {
        double originalCost = rentable.getDailyRate() * days;
        if (includeCarWash) {
            return originalCost + 10.0;
        } else {
            return originalCost;
        }
    }
}