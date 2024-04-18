package day08_scanner_logical_operators;
/*
     Want to go for a walk
     We will go for a walk
           if it is not raining
           and the weather is above 70

 */
public class GoForWolk {
    public static void main(String[] args) {

        boolean isRaining = false;
        int temperature = 60;

        System.out.println("Go for a wolk: " + (isRaining && temperature >70));



    }
}
