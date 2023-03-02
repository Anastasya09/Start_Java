package Homeworks.HW_JAVA;

import java.util.Scanner;

public class L4HW_Greetings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Выберите язык приветствия: ");
        System.out.println("1 - Русский");
        System.out.println("2 - Английский");
        System.out.println("3 - Испанский");
        System.out.println("4 - Турецкий");

        int choice = input.nextInt();

        String greeting = "";
        switch (choice) {
            case 1:
                greeting = "Привет!";
                break;
            case 2:
                greeting = "Hello!";
                break;
            case 3:
                greeting = "Hola!";
                break;
            case 4:
                greeting = "Merhaba!";
                break;
            default:
                System.out.println("Некорректный выбор!");
        }

        System.out.println(greeting);
    }
}
