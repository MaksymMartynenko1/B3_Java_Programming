package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "pen";
        //          012



        System.out.println( s.indexOf("p") );
        //System.out.println( s.indexOf('p') );
        System.out.println(s.indexOf("pe"));

        System.out.println("___________");

        System.out.println( s.indexOf("e") );
       // System.out.println( s.indexOf('e') );
        System.out.println( s.indexOf("en") );

        System.out.println("____________");

        System.out.println( s.indexOf("n") );
        //System.out.println( s.indexOf('n') );
        System.out.println( s.indexOf("pen") );

        System.out.println("____________");

        System.out.println( s.indexOf('x') );
        System.out.println( s.indexOf("x") );
        System.out.println( s.indexOf("pem") );

        System.out.println("____________");
        System.out.println(s.indexOf('p',4));   //-1
        System.out.println(s.indexOf("pe", 1)); //3

        System.out.println(s.indexOf("pe", 10)); // This will not give EXCEPTION, it wil just say that there is not MATCHING with -1

        System.out.println(s.indexOf("pn"));

    }
}
