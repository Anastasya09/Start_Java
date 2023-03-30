package Lesson13;

public class NotInResultException extends Exception{
    int n;
    int d;

    NotInResultException (int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Result of operation " + n +
                " / " + d +
                "is not an integer.";
    }
}
