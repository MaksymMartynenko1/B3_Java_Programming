package day11_if_statements;

import java.util.Scanner;

public class CheckHunder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Are you hungry/ [true/false]");
        boolean isHundry = input.hasNextBoolean();

if (input.hasNextBoolean()){
    System.out.printf("You are hundry,....");
}

if (!isHundry) {
    System.out.printf("Great, then practice java");
}
    }
}
