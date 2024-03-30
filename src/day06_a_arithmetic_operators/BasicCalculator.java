package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1-num2;
        double multiplication = num1*num2;
        double division = num1 / num2;
        double remeinder = num1 % num2;


        //TODO:

        System.out.println(num1 + " + " + num2 + "=" + addition);
        System.out.println(num1 + " - " + num2 + "=" + subtraction);
        System.out.println(num1 + " * " + num2 + "=" + multiplication);
        System.out.println(num1 + " / " + num2 + "=" + division);
        System.out.println(num1 + " % " + num2 + "=" + remeinder);


        num1 = 13;
        num2 = 5;
        remeinder = num1 % num2;
        System.out.println(num1 + " % " + num2 + "=" + remeinder);




        System.out.println("--------------------------------------------------------");
        System.out.println(3.2 + 1);

        int a =3;
        double d = 4;// 4.0
        System.out.println(a + d); //7.0

        byte b =3;
        short s =7;
        System.out.println(b + s);// 10 -- int

        byte b2 = 3;
        short s2 = 7;
        short total = (short)(b2 + s2);

        int a1 =4;
        int a2 = 5;
        double d2 = a1 + a2;





    }


}
