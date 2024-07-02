class Minivan extends Vehicle<Minivan> {
    public Minivan(String make, String model, int year) {
        super(make, model, year);
    }
    @Override
    public double getDailyRate(){
        return 40.0;
    }
}
