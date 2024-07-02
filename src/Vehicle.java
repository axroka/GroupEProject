//Parent code

abstract class Vehicle <T extends Vehicle<T>>implements Rentable<T> {
     private String make;
     private String model;
     private int year;

     public Vehicle(String make, String model, int year) {
         this.make = make;
         this.model = model;
         this.year = year;
     }

     public String getMake() {

         return make;
     }

     public String getModel() {

         return model;
     }

     public int getYear() {

         return year;
     }
     @Override
     public abstract double getDailyRate();

     public String toString() {
         return make + " " + model + " " + year;
     }
}


