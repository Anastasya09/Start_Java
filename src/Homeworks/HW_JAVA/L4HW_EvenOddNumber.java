package Homeworks.HW_JAVA;

import java.util.Scanner;

public class L4HW_EvenOddNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное.");
        } else {
            System.out.println("Число " + num + " нечетное.");
        }
    }
}
