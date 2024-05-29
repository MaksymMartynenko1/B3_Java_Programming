package day08_scanner_logical_operators;

public class Letters {
    public static void main(String[] args) {

        // Task:  define a character. Print the next 4 characters
        char letter = 'G';

        System.out.println("Original character " + letter); //G

        System.out.println("Next 4 characters: ");
        System.out.println(++letter); // H
        System.out.println(++letter); // I
        System.out.println(++letter); // J
        System.out.println(++letter); // K
    }
}