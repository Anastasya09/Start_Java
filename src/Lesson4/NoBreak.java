package Lesson4;

public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is less than 1");
                case 1:
                    System.out.println("i is less than 2");
                case 2:
                    System.out.println("i is less than 3");
                case 3:
                    System.out.println("i is less than 4");
                case 4:
                    System.out.println("i is less than 5");
//                default:
//                    System.out.println("i is equal or greater than 5");
            }
            System.out.println();
        }
    }
}
