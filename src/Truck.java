class Truck extends Vehicle{
    public Truck (String make, String model, int year) {
        super(make, model, year);
    }
    @Override
    public double getDailyRate(){
        return 30.0;

    }
}