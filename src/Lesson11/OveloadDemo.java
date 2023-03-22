package Lesson11;

public class OveloadDemo {
    public static void main(String[] args) {

        Oveload myObj = new Oveload();
        Oveload myObj2 = new Oveload(3);
        Oveload myObj3 = new Oveload(3, 7);
        Oveload myObj4 = new Oveload(3.0, 7);


        Factorial f = new Factorial();
        System.out.println("Recursive method calculation: ");
        System.out.println("Factorial of 4 is equal to "
                + f.calcFactorialRecursive(4));
        System.out.println("Factorial of 3 is equal to "
                + f.calcFactorialRecursive(3));
        System.out.println("Factorial of 2 is equal to "
                + f.calcFactorialRecursive(2));
        System.out.println("Factorial of 5 is equal to "
                + f.calcFactorialRecursive(5));

        System.out.println("\n\nIterative method calculation: ");
        System.out.println("Factorial of 4 is equal to "
                + f.calcFactorialIterative(4));
        System.out.println("Factorial of 3 is equal to "
                + f.calcFactorialIterative(3));
        System.out.println("Factorial of 2 is equal to "
                + f.calcFactorialIterative(2));
        System.out.println("Factorial of 5 is equal to "
                + f.calcFactorialIterative(5));

    }
}
