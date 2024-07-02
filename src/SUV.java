class SUV extends Vehicle {
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public double getDailyRate() {
        return 200.0;
    }
}
