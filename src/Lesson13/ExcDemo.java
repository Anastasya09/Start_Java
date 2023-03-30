package Lesson13;

import Lesson12.A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcDemo {
    public static void main(String[] args) {

        int[] nums = new int[4];


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter value for an int array element: ");

            nums[1] = scanner.nextInt();
            System.out.println("I want to continue!!!");
        } catch (InputMismatchException error) {
            System.out.println("The exception of type InputMismatchException has occured!!!!" + error.getMessage());
        }
        System.out.println("After catch");


        try {
            genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
            System.out.println("Fatal error!!!!");
        } finally {
            System.out.println("Exit from try");
        }

        System.out.println("continues");
    }

    public static void genException() {
        int[] numer = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length + 5; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException e) {
                System.out.println("Attempt to divide by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The exception of type ArrayIndexOutOfBoundsException has occured!!!!" + e.getMessage());
                throw e;
            }
        }
    }
}

