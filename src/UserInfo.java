import java.util.ArrayList;
import java.util.Scanner;

/**
 * UserInfo class is for storing user information and handling user interactions.
 * This class provides methods to collect and validate user information for vehicle rental.
 *
 * @author DT, Aakriti, Daniel, and Jennifer
 * Created on 06/24/2024
 */
class UserInfo {

    /**
     * The name of the user.
     */
    private String name;

    /**
     * The age of the user.
     */
    private int age;

    /**
     * The type of vehicle the user wants to rent.
     */
    private String vehicleType;

    /**
     * The number of days the user wants to rent the vehicle.
     */
    private int rentalDays;

    /**
     * Collects user information through a series of prompts.
     *
     * @param scanner The Scanner object for reading user input.
     * @return true if the user is eligible to rent a vehicle, false otherwise.
     */
    public boolean getUserInfo(Scanner scanner) {

        System.out.print("What is your name: ");
        name = scanner.nextLine();
        System.out.println("----------------------------------------");


        System.out.print("How old are you: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------------------------------");


        if (age < 25) {
            System.out.println("Sorry you must be at least 25 years old to rent a vehicle");
            scanner.close();
            return false;
        }
        System.out.print("Do you have a driver license(yes/no): ");
        String license = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");


        boolean LicenseAndInsurance = license.equals("yes") ? Insurance(scanner) : false;


        if (!LicenseAndInsurance){
            System.out.println("Sorry you are ineligible to rent a vehicle. Please have a nice day!");
            scanner.close();
            return false;
        }

        ArrayList<String> cars = new ArrayList<String>();

        System.out.println("Available vehicles and their daily rental prices:");
        cars.add("Suv $20");
        cars.add("Sedan $15");
        cars.add("Truck $30");
        cars.add("Minivan $40");

        System.out.println(cars);
        System.out.println("----------------------------------------");


        System.out.print("What vehicle would you like to rent out: ");
        vehicleType = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");

        rentalDays = getRentalDays(scanner);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Days: " + rentalDays);
        return true;
    }

    /**
     * Checks if the user has insurance.
     *
     * @param scanner The Scanner object for reading user input.
     * @return true if the user has insurance, false otherwise.
     */
    private boolean Insurance(Scanner scanner){
        System.out.print("Do you have insurance (yes/no): ");
        String insurance = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");
        return insurance.equals("yes");
    }

    /**
     * Prompts the user to enter the number of rental days and validates the input.
     *
     * @param scanner The Scanner object for reading user input.
     * @return The number of rental days.
     */
    private int getRentalDays(Scanner scanner) {
        System.out.print("Enter the number of days you're planning to rent this vehicle: ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------------------------------");


        if (days < 0) {
            System.out.println("Invalid input");
            return getRentalDays(scanner);
        }
            return days;
        }

    /**
     * Gets the type of vehicle the user wants to rent.
     *
     * @return The type of vehicle.
     */
        public String getVehicleType(){
        return vehicleType;
    }

    /**
     * Gets the number of rental days.
     *
     * @return The number of rental days.
     */
    public int getRentalDays() {
        return rentalDays;

    }

    /**
     * Returns a string representation of the user's selected vehicle type.
     *
     * @return The type of vehicle.
     */
    @Override
    public String toString(){
        return  vehicleType;
    }
}
