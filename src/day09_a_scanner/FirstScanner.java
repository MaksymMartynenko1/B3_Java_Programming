package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        // #1 Scaner Object declaration/ instantiation

        Scanner input = new Scanner(System.in);

//
        System.out.println("Pleas, enter a number: ");
        int userNumber =  input.nextInt(); // Returns input as int -->
        System.out.println("You entered: " + userNumber);




    }
}
