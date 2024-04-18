package day10_if_statements;

public class SingleIfStatement {

    public static void main(String[] args) {

        if (false){
            System.out.println("Hello World!");
        }

        System.out.println("Second Print Statement");


        if (true) {
            System.out.println("Todey is Wednesday!");
        }


        int score = 60;
        if (score >= 75){
            System.out.println("Passing the exam!");

        }
        if (score < 75) {
            System.out.println("Failing the exam!");
        }

        int year = 2020;
        boolean isLockdown = year == 2020  || year == 2021;

        if(isLockdown) { isLockdown = true;
            System.out.println("Stay at home");
            System.out.println("Practice CODING");
        }
//        if(isLockdown) { isLockdown = true
//            System.out.println("Stay at home");
//            System.out.println("Practice CODING");
//        }


    }
}
