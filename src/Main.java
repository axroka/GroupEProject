import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Toyota Rental Store");
        System.out.println("----------------------------------------");

        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();

        if (!userInfo.getUserInfo(scanner)) {
            scanner.close();
            return;
        }
        Vehicle selectedVehicle = null;
        try {
            switch (userInfo.getVehicleType().toLowerCase()) {
                case "sedan":
                    selectedVehicle = new Sedan("Toyota", "Corolla", 2023);
                    break;
                case "suv":
                    selectedVehicle = new SUV("Toyota", "RAV4", 2023);
                    break;
                case "truck":
                    selectedVehicle = new Truck("Toyota", "Tacoma", 2023);
                    break;
                case "minivan":
                    selectedVehicle = new Minivan("Toyota", "Sienna", 2023);
                    break;

                default:
                    throw new IllegalAccessException("Invalid vehicle type:" + userInfo.getVehicleType());
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            scanner.close();
            return;
        }

        CarWash carwash = new CarWash();
        boolean includeCarWash = carwash.askForCarWash(scanner);

        int rentalDays = userInfo.getRentalDays();

        if (includeCarWash) {
            double costWithCarWash = RentalCost.calculateRentalCost(selectedVehicle, rentalDays, true);
            System.out.println("Your " + selectedVehicle + " rental with car wash will cost: $" + costWithCarWash);
        } else {
            double costWithoutCarWash = RentalCost.calculateRentalCost(selectedVehicle, rentalDays);
            System.out.println("Your " + selectedVehicle + " rental without car wash will cost: $" + costWithoutCarWash);
        }
        System.out.println("Have a safe trip!");
        scanner.close();
    }
}