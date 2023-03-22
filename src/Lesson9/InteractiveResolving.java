package Lesson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class InteractiveResolving {
    public static void main(String[] args) {

        try {

            File myObj = new File("C:\\Users\\Anastasia\\IdeaProjects\\Start_Java\\src\\Lesson9\\input.txt"); //объявили переменную и создали объект, указывая путь к нему
            Scanner instrumentDleaSchitivania   = new Scanner(myObj); // объявили переменную и создали объект типа Scanner и в конструктор передали объект типа File

            while (instrumentDleaSchitivania.hasNextLine()) { //пока файл не закончился выполнять:
                String stroka = instrumentDleaSchitivania.nextLine();// объявили переменную класса String и инициализируем её тем объектом типа String который возвращается методом класса Scanner - nextLine()
                String[] massivSlov = stroka.split("[^a-zA-Z0-9-Яа-я]"); // объявили переменную класса массив, в которой будут храниться объекты типа String и инициализируем её теми элементами
                // на которые разбил нашу строку метод split()
                for (String element : massivSlov) {

                    if (isPalindrome(element.toLowerCase())) System.out.println(element);
                }
            }

            instrumentDleaSchitivania.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        public static boolean isPalindrome (String word) {
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
