package Lesson4;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        char answer = 'S';

        System.out.println("A letter that you should guess is from the range of A to Z.");
        System.out.println("Try to guess it: ");

        ch = input.next().charAt(2);

//        if (true/false statement) {if true action}
//        else {if false action}

        System.out.println("This is your result: ");
        if (ch == answer) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lose. Your guess is " + ch + ", but the answer is " + answer);
        }
    }
}
