class Sedan extends Vehicle {
    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public double getDailyRate() {
        return 15.0;
    }
}

