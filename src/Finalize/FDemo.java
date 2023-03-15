package Finalize;

public class FDemo {
    int x;

    FDemo (int i) {
        x = i;
    }
    protected void finalize () {
        System.out.println("Финализация " + x);
    }

    void generator (int i) {
        FDemo o = new FDemo(0);
    }
}
