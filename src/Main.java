import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Toyota Rental Store");
        System.out.println("----------------------------------------");

        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();

        if (!userInfo.getUserInfo()) {
            scanner.close();
            return;
        }
        Vehicle selectedVehicle = null;
        try {
            switch (userInfo.getVehicleType()) {
                case "sedan":
                    selectedVehicle = new Sedan("Toyota", "Corolla", 2023);
                    break;
                case "suv":
                    selectedVehicle = new SUV("Toyota", "RAV4", 2023);
                    break;
                case "Truck":
                    selectedVehicle = new Truck("Toyota", "Tacoma", 2023);
                    break;
                case "Minivan":
                    selectedVehicle = new Minivan("Toyota", "Sienna", 2023);
                    break;

                default:
                    throw new IllegalAccessException("Invalid vehicle type:" + userInfo.getVehicleType());
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            return;
        }

        CarWash carWash = new CarWash();
        boolean includeCarWash = carWash.askForCarWash(scanner);

        if (includeCarWash) {
            double costWithCarWash = RentalCost.calculateRentalCost(selectedVehicle, userInfo.isRentalDays(), true);
            System.out.println("Your " + selectedVehicle + " rental with car wash will cost: $" + costWithCarWash);
        } else {
            double costWithoutCarWash = RentalCost.calculateRentalCost(selectedVehicle, userInfo.isRentalDays());
            System.out.println("Your " + selectedVehicle + " rental without car wash will cost: $" + costWithoutCarWash);
        }
    }
}