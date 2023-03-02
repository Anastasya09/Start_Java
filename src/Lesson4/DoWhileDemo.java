package Lesson4;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {
        int i;

        Scanner input = new Scanner(System.in);

        i = 0;

        do {
            System.out.println("enter another i:");
            i = input.nextInt();
        } while (i > 0);


        while (i > 0); {
            System.out.println("enter another i:");
            i = input.nextInt();
        }

        for (; i > 0;) {
            System.out.println("enter another i:");
            i = input.nextInt();
        }
    }
}
