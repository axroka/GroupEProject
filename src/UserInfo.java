import java.util.Scanner;

class UserInfo {

    public void user() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What type of vehicle would you like to rent?");
        String vehicle = scanner.nextLine();

        System.out.println("How long are you planning to rent this vehicle?");
        double time = Double.parseDouble(scanner.nextLine());

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Time: " + time);



        if (age < 18) {
            System.out.println("Sorry you must be atleast 18 years old to rent a vehicle");
        } else {
            System.out.println("Please present your ID");
        }
    }
}