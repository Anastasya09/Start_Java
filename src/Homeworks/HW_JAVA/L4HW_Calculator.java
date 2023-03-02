package Homeworks.HW_JAVA;

import java.util.Scanner;

public class L4HW_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = input.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = input.nextDouble();

        // Сумма
        double sum = num1 + num2;
        System.out.println("Сумма чисел: " + sum);

        // Среднее значение
        double average = sum / 2;
        System.out.println("Среднее значение: " + average);

        // Сравнение
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2) {
            System.out.println(num1 + " больше, чем " + num2);
        } else {
            System.out.println(num1 + " меньше, чем " + num2);
        }
    }
}
