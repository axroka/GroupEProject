class SUV extends Vehicle<SUV> {
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public double getDailyRate() {
        return 20.0;
    }
}
