import java.util.Scanner;

/**
 * CarWash class for handling car wash options in the Toyota Rental Store application.
 * @author DT and Aakriti
 * Created on 07/02/2024
 */
public class CarWash {

    /**
     * Asks the user if they want a car wash before their rental.
     *
     * @param scanner The Scanner object to read user input regarding car wash option.
     * @return true if the user wants a car wash, false otherwise.
     */
    public boolean askForCarWash(Scanner scanner) {
        System.out.print("Do you want a car wash before your rental for $10 (yes/no): ");
        String carWashResponse = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");

        if (carWashResponse.equals("yes")) {
            return true;
        } else if (carWashResponse.equals("no"))
        {
            return false;
        } else {
            System.out.println("Invalid Response. Please enter Yes or No");
            return askForCarWash(scanner);
        }
    }
}