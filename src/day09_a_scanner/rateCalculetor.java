package day09_a_scanner;

import java.util.Scanner;

public class rateCalculetor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is you salary? $");
        double salary = input.nextDouble(); //120,000.00

        System.out.println("How many hours do you work in a week? ");
        int hoursInWeek = input.nextInt(); //40

        double hourlyRate = salary / (hoursInWeek * 52);

        System.out.println("With the annual salary of " + salary + " and working for " + hoursInWeek + " hours in a week, you hourly rate is $" + hourlyRate);

       // Math.round()



        }



    }

