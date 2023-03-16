package Homeworks_Java;

import java.util.ArrayList;
import java.util.Scanner;

import static Homeworks_Java.Palindrome.isPalindrome;

public class L7HW_PalindromeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String cleanText = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

        String lowerCaseText = cleanText.toLowerCase();

        String[] words = lowerCaseText.split(" ");

        ArrayList<String> palindromes = new ArrayList<>();

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        if (palindromes.isEmpty()) {
            System.out.println("В тексте нет палиндромов");
        } else {
            System.out.println("Найденные палиндромы:");
            for (String palindrome : palindromes) {
                System.out.println(palindrome);
            }
        }
    }

}
