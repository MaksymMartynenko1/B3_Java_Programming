package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s = "javaxa";

        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));

        System.out.println("_________");


        String s2 = "abcbcbcb";
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));
        System.out.println("_________");

        System.out.println(s2.indexOf("cb"));
        System.out.println(s2.lastIndexOf("cb"));

        System.out.println("_________");
        System.out.println(s2.indexOf("cbd"));
        System.out.println(s2.lastIndexOf("cbd"));

        System.out.println("_________");
        //"abcbcbcb"
        System.out.println(s2.indexOf("bc"));
        System.out.println(s2.lastIndexOf("bc"));

        System.out.println("_________");
        //"abcbcbcb"
        System.out.println(s2.indexOf("bc",2));//3
        System.out.println(s2.lastIndexOf("bc",2));//5;

        System.out.println("_________");
        String s3 = "ababababab";
        //           0123456789
        System.out.println(s3.indexOf("b",4)); //5
        System.out.println(s3.lastIndexOf("b",4));//3

        System.out.println("_________");
        String s4 = "ababababab";
        //           0123456789
        System.out.println(s4.indexOf("ba",2)); //3
        System.out.println(s4.lastIndexOf("ba",6));//5

    }
}
