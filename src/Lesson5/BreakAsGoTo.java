package Lesson5;

public class BreakAsGoTo {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
            two: {
            three: {
                System.out.println("\ni is equal to " + i);
                if (i == 1) break one;
                if (i == 2) break two;
                if (i == 3) break three;

                System.out.println("THIS WILL NEVER BE PRINTED!");
                    }
                    System.out.println("After three");
                 }
                System.out.println("After two");
            }
            System.out.println("After one");
        }
        System.out.println("After for loop");
    }
}
