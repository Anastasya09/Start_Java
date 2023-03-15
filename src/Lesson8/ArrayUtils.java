package Lesson8;

import java.util.Scanner;

public class ArrayUtils {
    static int[] randomArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }
    static int[][] randomArray(int[][] array, int min, int max) {
        for (int t = 0; t < array.length; t++) {
            for (int i = 0; i < array[t].length; i++) {
                array[t][i] = (int) (Math.random() * (max - min) + min);
            }
        }
        return array;
    }
    static int[] inputArray (int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter[" + (i+1) + "]= " + " array element:");
            array[i] = input.nextInt();
        }
        return array;
    }
    public static void showArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
    public static void showArray(char[] array) {
        for (char element : array) {
            System.out.print(element + " ");
        }
    }
    public static void showArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    static void showArray(int[][] array) {
        for (int t = 0; t < array.length; t++) {
            for (int i = 0; i < array[t].length; i++) {
                System.out.print("table[" + t + "][" + i + "] = "
                        + array[t][i] + " ");
            }
            System.out.println();
        }
    }

    static void showMinMax(int[] array) {
        int min, max;
        max = min = array[0];

        for (int i = 0; i < 10; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.println("maximum is " + max);
        System.out.println("minimum is " + min);
    }

    public static void sortArray(int[] array, String order) {
        int i, j, t, k;
        for (i = 1; i < array.length; i++) {
            for (k = 0, j = array.length - 1; j >= i; j--, k++) {
                if ((order.equals("desc"))? (array[j - 1] < array[j]) : (array[j - 1] > array[j])) {
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public static void sortArray(int[] array) {
        System.out.println("\nEnter \"desc\" for descending order:");
        Scanner input = new Scanner(System.in);
        String order = input.nextLine();
        int i, j, t, k;
        for (i = 1; i < array.length; i++) {
            for (k = 0, j = array.length - 1; j >= i; j--, k++) {
                if ((order.equals("desc"))? (array[j - 1] < array[j]) : (array[j - 1] > array[j])) {
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public static int[] copyArray(int[] from, int[] to) {
        if (to.length >= from.length) {
            for (int i = 0; i < to.length; i++) {
                to[i] = from[i];
            }
        }
        return to;
    }

    public static int sumElements(int[] array, int untilTheElementIndex) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if(i == untilTheElementIndex) break;
        }
        return result;
    }

    public static int sumElements(int[] array) {
        int result = 0;
//        int i = 0;
        for (int element: array) {
            result += element;
//            if (i == 2) break;
//            i++;
        }
        return result;
    }

    public static void searchElement(int[] array, int wanted) {
        boolean ifFound = false;
        for (int element : array) {
            if (element == wanted) {
                ifFound = true;
                break;
            }
        }
        System.out.println(ifFound?"Found!":"Not found.");
    }
}

