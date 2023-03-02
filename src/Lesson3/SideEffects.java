package Lesson3;

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;

        if (false & (++i < 100))
            System.out.println("This line won't be displayed");
        System.out.println("If operator is executed: " + i);

        if (false && (++i < 100))
            System.out.println("This line won't be displayed");
        System.out.println("2nd part of if operator is NOT executed: " + i);

    }
}
