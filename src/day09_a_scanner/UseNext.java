package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.next();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter job titel");
        String jobTitel = input.nextLine();


        System.out.println("Today: " + day);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitel);

    }
}
