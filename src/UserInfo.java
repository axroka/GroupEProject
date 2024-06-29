import java.util.Scanner;

class UserInfo {
    private String name;
    private int age;
    private String vehicleType;
    private int rentalDays;

    public boolean getUserInfo() {
        Scanner scanner = new Scanner(System.in);

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
        System.out.print("What vehicle would you like to rent out: ");
        vehicleType = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");


        rentalDays = getRentalDays(scanner);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Days: " + rentalDays);
        scanner.close();
        return true;
    }
    private boolean Insurance(Scanner scanner){
        System.out.print("Do you have insurance (yes/no)");
        String insurance = scanner.nextLine().toLowerCase();
        System.out.println("----------------------------------------");
        return insurance.equals("yes");
    }
    private int getRentalDays(Scanner scanner) {
        System.out.print("Enter the number of days you're planning to rent this vehicle: ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------------------------------");


        if (days < 0) {
            System.out.println("Invalid input");
            return getRentalDays(scanner);
        } else {
            return days;
        }
    }
    public String getVehicleType(){
        return vehicleType;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}
