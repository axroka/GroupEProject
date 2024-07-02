import java.util.Scanner;

public class CarWash {
public boolean askForCarWash(Scanner scanner) {
    System.out.print("Do you want a car wash before your rental for $10 (yes/no): ");
    String carWashResponse = scanner.nextLine().toLowerCase();
    System.out.println("----------------------------------------");
    return carWashResponse.equals("yes");

    }
}