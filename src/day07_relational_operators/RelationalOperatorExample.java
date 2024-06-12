package day07_relational_operators;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        System.out.println(10 > 5); //true
        System.out.println(10 < 5); //false

        int a = 5;
        int b = 3;

        System.out.println(a > b); //true
        boolean aAndB = a < b;
        System.out.println(aAndB); //false


        System.out.println(6 >= 6); //true
        System.out.println(6 <= 6); //true
        System.out.println(6 < 6);

        System.out.println(4 == 4); // == this is comparing if it is equal //true
        System.out.println(4 != 4); // != this is NOT EQUAL //false

        System.out.println(3 != 1); //true
    }
}
