package day07_relational_operators;

public class OperatorPractice3 {

    public static void main(String[] args) {
        int t = 100;

       // int p = -   * - t-- /  + --t;


        ++t;
        System.out.println(t--);
        // 1st use ->101
        // 2nd update ->100
        t++;
        System.out.println(--t);
            //1st  up -> 100
            //2nd use -> 100


        System.out.println("t: " + t); // t: 100
    }
}
