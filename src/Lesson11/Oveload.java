package Lesson11;

public class Oveload {

    int a;
    int b;

    Oveload() {
    }

    Oveload(int a) {
        this.a = a;
    }

    Oveload(double a, int b) {
        this.a = (int) a;
        this.b = b;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(double a, double b) {
        return (int) (a + b);
    }

    double sum(double a, int b) {
        return a + b;
    }
}
