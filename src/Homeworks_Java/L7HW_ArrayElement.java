package Homeworks_Java;

import java.util.Arrays;
import java.util.Random;
public class L7HW_ArrayElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = 1;
        int max = 100;
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            sum += array[i];
        }
        double average = (double) sum / array.length;
        int closest = array[0];
        int minDiff = Math.abs(array[0] - (int) average);
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - (int) average);
            if (diff < minDiff) {
                closest = array[i];
                minDiff = diff;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Среднее значение: " + average);
        System.out.println("Элемент, ближайший к среднему значению: " + closest);
    }

}
