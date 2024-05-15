package day03_comments_escape_sequence;

public class VariableIntro {
    public static void main (String [] args) {

        // Option - 1
        int quantity1;  // This is just: VARIABLE DECLARATION
        quantity1 = 4;  // This is just: ASSIGNING VALUE/DATA into VARIABLE
        System.out.println(quantity1);
        System.out.println(4);
        quantity1 = 5; // This is just: RE_ASSIGNMENT - I assigned another value to my container
        System.out.println(quantity1); // 5


        // Option - 2
        int quantity2 = 3;  // This is just: DECLARING VARIABLE and at the same time ASSIGNING VALUE/DATA
        System.out.println(quantity2);
        System.out.println(3);


        byte n1 = 4;
        short n2 = 4;
        int n3 = 4;
        long n4 = 349832798237498237L;
        System.out.println(n2);
        System.out.println(4);


        float d1 = 3.4f;
        double d2 = 3.4;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(4.5);



        char letter = 'a';
        System.out.println(letter);
        String letter2 = "a";


        boolean var1 = true;
        System.out.println(var1);
        boolean var2 = false;
        System.out.println(var2);



        // Sample for String
        String word = "Anything"; // Here, I declared a String VARIABLE that hold a value/data which ish "Anything"
        System.out.println("Anything");
        System.out.println(word);




        int result;

        int number1 = 10;
        int number2 = 5;

        result  = number1 + number2;
        System.out.println(result);


    }
}
