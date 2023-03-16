package Homeworks_Java;

public class L7HW_ArrayManipulation {
    public static void main(String[] args) {

        int[] array = {5, 2, 8, 7, 3, 9, 1};

        double quarter = 0.25;

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        int average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1) {
                array[i] *= (1 - quarter);
            } else {
                array[i] *= (1 + quarter);
            }
        }

        System.out.print("Измененный массив: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}
