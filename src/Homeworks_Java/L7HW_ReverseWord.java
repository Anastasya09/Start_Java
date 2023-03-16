package Homeworks_Java;

import java.util.Scanner;
public class L7HW_ReverseWord {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите слово: ");

            String word = scanner.next();

            StringBuilder reversedWord = new StringBuilder(word).reverse();

            System.out.println("Переписанное слово: " + reversedWord);
        }

}
