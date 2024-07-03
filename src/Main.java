import java.util.Scanner;
import java.util.*;

/**
 * The Main class for the Toyota Rental Store application.
 * This class handles user input and vehicle rental processes.
 *
 * @author DT, Aakriti, and Jennifer
 * Created on 06/24/2024
 */
public class Main {

    /**
     * The main method to run the Toyota Rental Store application.
     *
     * @param args Stores incoming command line arguments
     */
    public static void main(String[] args) {
    Stack<Receipt> receipt = new Stack<>();
        System.out.println("Welcome to Toyota Rental Store");
        System.out.println("----------------------------------------");

        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();

        // HashMap to store car rental rates
        HashMap<String ,Double> carRates = new HashMap<>();
        carRates.put("suv",20.0);
        carRates.put("sedan", 15.0);
        carRates.put("truck", 30.0);
        carRates.put("minivan", 40.0);

        if (!userInfo.getUserInfo(scanner)) {
            scanner.close();
            return;
        }
        receipt.push(new Receipt("Vehicle Type", userInfo.toString()));

        Vehicle selectedVehicle = null;
        try {
            switch (userInfo.getVehicleType().toLowerCase()) {
                case "sedan":
                    selectedVehicle = new Sedan("Toyota", "Corolla", 2024);
                    break;
                case "suv":
                    selectedVehicle = new SUV("Toyota", "RAV4", 2024);
                    break;
                case "truck":
                    selectedVehicle = new Truck("Toyota", "Tacoma", 2024);
                    break;
                case "minivan":
                    selectedVehicle = new Minivan("Toyota", "Sienna", 2024);
                    break;

                default:
                    throw new IllegalAccessException("Invalid vehicle type:" + userInfo.getVehicleType());
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            scanner.close();
            return;
        }
        receipt.push(new Receipt("Vehicle Selected", selectedVehicle.toString()));

        CarWash carwash = new CarWash();
        boolean includeCarWash = carwash.askForCarWash(scanner);

        receipt.push(new Receipt("Car Wash Option", includeCarWash ? "Yes": "No"));
        int rentalDays = userInfo.getRentalDays();

        receipt.push(new Receipt("Rental Days", String.valueOf(rentalDays)));
        if (includeCarWash) {
            double costWithCarWash = RentalCost.calculateRentalCost(selectedVehicle, rentalDays, true);
            System.out.println("Your " + selectedVehicle + " rental with car wash will cost: $" + costWithCarWash);
        } else {
            double costWithoutCarWash = RentalCost.calculateRentalCost(selectedVehicle, rentalDays);
            System.out.println("Your " + selectedVehicle + " rental without car wash will cost: $" + costWithoutCarWash);
        }
        System.out.println("----------------------------------------");
        System.out.println("Receipt");
        System.out.println("----------------------------------------");
        while(!receipt.isEmpty()){
            System.out.println(receipt.pop());
        }
        System.out.println("----------------------------------------");
        System.out.println("Have a safe trip!");
        scanner.close();
    }
}