package Lesson8;

public class ArrayDemo {
    public static void main(String[] args) {

        int numbers[]; //C = style array declaration
        int[] numbers1; //java style array declaration
        numbers = new int[10];

        //initializing array members
        for (int i = 0; i < 10; i++){
            numbers[i] = i;
        }

        //print array
        for (int i = 0;i < 10; i++) {
            System.out.println("numbers[" + i + "]= " + numbers[i]);
        }

    }
}
