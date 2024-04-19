package day07_relational_operators;

public class OperatorPractice {

    public static void main(String[] args) {

       // System.out.println(-5 + 3);
       int b = 10;
       b++; //b = b + 1; -- POST increment
       System.out.println(b);  //1 ection: print the value of b
        b--;
        System.out.println(b); //1 ection: print the value of b

        System.out.println(b++); //2 ections: print and update the value of b
                                //1st - us it --> b = 10
                                //2nd - update --> b = 11

        System.out.println(b--);  //11 ---> b = 11-1 = 10
        System.out.println(b);  //10



    }
}
