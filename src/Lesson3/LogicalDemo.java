package Lesson3;

public class LogicalDemo {
    public static void main(String[] args) {

        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j");
        if (i >= j) System.out.println("i >= j");
        if (i > j) System.out.println("i > j");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("b1 & b2 : true");//false
        if (b1 | b2) System.out.println("b1 | b2 : true");//true
        if (b1 ^ b2) System.out.println("b1 ^ b2 : true");//true
        if (!b1) System.out.println("!b1 : true");//false
        if (!b2) System.out.println("!b2 : true");//true

        if (b1 && b2) System.out.println("b1 && b2 : true");//false
        if (b2 && b1) System.out.println("b1 && b2 : true");//false
        if (b1 || b2) System.out.println("b1 || b2 : true");//true
        if (b2 || b1) System.out.println("b1 || b2 : true");//true



    }
}
