package Lesson8;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {


        int[] numbers = new int[7];

        numbers = ArrayUtils.randomArray(numbers, -100, 100);

        System.out.println("Initial array:");

        ArrayUtils.showArray(numbers);

        ArrayUtils.sortArray(numbers, "asc");

        System.out.println("Sorting result: ");

        ArrayUtils.showArray(numbers);
        ArrayUtils.showArray(numbers);

        System.out.println("Sorting result: ");

        ArrayUtils.sortArray(numbers);
    }
}
