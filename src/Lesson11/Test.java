package Lesson11;

public class Test {

    int a, b;

    Test(){

    }
    Test (int a, int b) {
        this.a = a;
        this.b = b;

    }
    void noChange (int i, int j) {
        i = i + j;
        j = -j;
    }

    void change() {
        a = a + b;
        b = -b;
    }
}
