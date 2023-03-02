package Lesson4;

public class Power {

    public static void main(String[] args) {

        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;

            while (e > 0) {
                result *= 3;
                e--;
            }

            System.out.println("3 в степени " + i + " равно " + result);
            System.out.println("текущее значение e: " + e);
        }
    }
}
