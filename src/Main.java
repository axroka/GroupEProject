import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Toyota Rental Store");
        System.out.println("----------------------------------------");
        UserInfo userInfo = new UserInfo();

        if (!userInfo.getUserInfo()) {
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
        }
            catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            return;
            }
            double cost = RentalCost.calculateRentalCost(selectedVehicle, userInfo.getRentalDays());
        System.out.println("Your " + selectedVehicle + " rental will cost : $" + cost);

    }
}
