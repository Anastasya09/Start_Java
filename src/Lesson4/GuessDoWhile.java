package Lesson4;

import java.util.Locale;
import java.util.Scanner;

public class GuessDoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;
        double startOfRange = 65;
        double endOfRange = 90;
        char answer = (char) (Math.random() * (endOfRange - startOfRange) + startOfRange);

        do {
            System.out.println("A letter that you should guess is from the range of A to Z. \nPress [!] to quit.");
            System.out.println("Try to guess it: ");

            ch = input.next().toUpperCase().charAt(0);

            if (ch < answer & ch != '!')
                System.out.println("Sorry, but the necessary letter is closer to the end of alphabet ");
            else if (ch > answer & ch != '!')
                System.out.println("Sorry, but the necessary letter is closer to the beginning of alphabet.");
            else if (ch == answer) System.out.println("Right!");

        } while (ch != answer && ch != '!');

        System.out.println("The right letter was " + answer + ".\nGood bye!");

        System.out.println(Math.random());

    }
}
