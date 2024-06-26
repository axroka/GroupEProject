import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();
        userInfo.user();


        String vehicle = null;
        switch (vehicle) {
            case "sedan":
                vehicle = String.valueOf(new Sedan("Toyota", "Corolla", "2023"));

                break;

            case "suv":
                vehicle = String.valueOf(new SUV("Toyota", "RAV4", "2023"));
                break;

            case "Truck":
                vehicle = String.valueOf(new SUV("Toyota", "Tacoma", "2023"));
                break;

            case "Minivan":
                vehicle = String.valueOf(new SUV("Toyota", "Sienna", "2023"));
                break;
                
            default:
                System.out.println("Sorry we do not have that vehicle. Please choose SUV,Sedan,Truck,or Minivan");
                scanner.close();
                return;
        }
            System.out.println("Your" + vehicle + "Details:");
        //trying to get it to print out the method
        scanner.close();

        
    }
}
