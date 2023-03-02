package Homeworks.HW_JAVA;

import java.util.Scanner;

public class L4HW_Multipliers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = input.nextInt();

        System.out.println("Пары множителей числа " + num + ":");

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i + " и " + num / i);
            }
        }
    }
}
