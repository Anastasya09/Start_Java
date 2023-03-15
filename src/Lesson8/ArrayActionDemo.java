package Lesson8;

import java.util.Scanner;

public class ArrayActionDemo {
    public static void main(String[] args) {


        int numbers[] = new int[20];
        int numbers2[] = {1, 67, 90, 576, 67, 4, 7576, 56, -1999, 67};

        numbers = ArrayUtils.randomArray(numbers, -100, 100);

//        numbers = ArrayUtils.populateArray(numbers);

        ArrayUtils.showArray(numbers2);

        ArrayUtils.showMinMax(numbers2);

//        SimpleActions.addNumbers(4, 5, 6, 7.0);
//        SimpleActions.addNumbers(4, 5, 6, 7);
//        SimpleActions.addNumbers(4, 5, 6);
//        SimpleActions.addNumbers(4, 5);

    }
}
