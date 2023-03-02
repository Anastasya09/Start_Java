package Lesson5;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {

        char ch;
        var input = new Scanner(System.in);

        System.out.println("Enter smth: ");

        for ( ; ; ) {
            ch = input.next().charAt(0);
            if (ch == 'q') break;
    }

//        while (true) {
//            ch = input.next().charAt(0);
//            if (ch =='q') break;
//        }

        System.out.println("You have entered q.");

    }

}
