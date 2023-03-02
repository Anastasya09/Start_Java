package Lesson4;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i=0; i<10; i++) {
            switch (i) {
                case 0 -> System.out.println("i is equal to 0");
                case 1 -> System.out.println("i is equal to 1");
                case 2 -> System.out.println("i is equal to 2");
                case 3 -> System.out.println("i is equal to 3");
                case 4 -> System.out.println("i is equal to 4");
                default -> System.out.println("i is equal or greater than 5");
            }
        }

        for (i=0; i<10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is equal to 0");
                    break;
                case 1:
                    System.out.println("i is equal to 1");
                    break;
                case 2:
                    System.out.println("i is equal to 2");
                    break;
                case 3:
                    System.out.println("i is equal to 3");
                    break;
                case 4:
                    System.out.println("i is equal to 4");
                    break;
                default:
                    System.out.println("i is equal or greater than 5");
            }
        }
    }
}
