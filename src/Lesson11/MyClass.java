package Lesson11;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    MyClass (int a, int b, int g) {
        setAlpha(a);
        beta = b;
        gamma = g;

    }

    void setAlpha (int a) {
        if (a > 0)
        alpha = a;

    }
    int getAlpha () {
        return alpha;
    }

//    double calculateDivision() {
//        return beta/alpha;
//    }

}
