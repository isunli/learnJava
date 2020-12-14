package controlflow;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            if (yearOfBirth >= 0 && yearOfBirth <= 100) {
                System.out.println(yearOfBirth);
                System.out.println(name);
            } else {
                System.out.println("Invalid number");
            }
        } else{
            System.out.println("Unable to parse year of birth");
        }


        scanner.close();

    }
}
