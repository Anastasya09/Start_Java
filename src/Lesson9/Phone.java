package Lesson9;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        int i;

        String[] numbers = {"5676-898", "322-88990", "54-1234", "5679-57"};
        String[][] numbersNames = {{"Tom", "5676-898"},
                {"Mary", "322-88990"},
                {"John", "54-1234"},
                {"Jane", "5679-57"}
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String wanted = input.nextLine();

        for (i = 0; i < numbersNames.length; i++) {
            if (numbersNames[i][0].equals(wanted)) {
                System.out.println(numbersNames[i][0] + " : " + numbersNames[i][1]);
                break;
            }
            if (i == numbersNames.length-1) System.out.println("Not found.");
        }

    }
}
