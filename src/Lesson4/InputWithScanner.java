package Lesson4;

import java.util.Scanner;

public class InputWithScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String myString;

        int number1;
        int number2;
        int sum;
        char l;

        System.out.println("Enter the string: ");

        myString = input.nextLine();

        System.out.println("myLine is: \"" + myString + "\"");


        System.out.println("Enter first integer: ");

        number1 = input.nextInt();

        System.out.println("Enter second integer: ");

        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.println("Sum is " + sum);

        l = input.next().charAt(0);

        System.out.println("l is " + l);
    }
}
