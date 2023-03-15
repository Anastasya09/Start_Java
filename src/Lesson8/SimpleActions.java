package Lesson8;

public class SimpleActions {
    static int addNumbers(int a, int b) {
        return a + b;
    }

    static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    static int addNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int addNumbers(int a, int b, int c, double d) {
        return a + b + c + (int)d;
    }
}
