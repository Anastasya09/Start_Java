package Lesson8;

public class TwoDimensionalArray {
    public static void main(String[] args) {

//        int[][] table1 = new int[3][];
//        table1[0] = new int[5];
//        table1[1] = new int[6];
//        table1[2] = new int[7];

        int lines = 3;
        int columns = 4;

        int[][] table = new int[lines][columns];

        int max = 100;
        int min = -100;

        table = ArrayUtils.randomArray(table, min, max);

        ArrayUtils.showArray(table);

        System.out.println();

        for (int t = 0; t < lines; t++) {
            for (int i = 0; i < columns; i++) {
                System.out.print(table[t][i] + "\t");
            }
            System.out.println();
        }

        int[] simpleArr = {23, 7, -9};

        System.out.println(simpleArr.length);

        int[][] notSoSimpleArray = {{23, 1},{2, -9, 7},{4, 9}};

        System.out.println(notSoSimpleArray.length);
        System.out.println(notSoSimpleArray[0].length);
        System.out.println(notSoSimpleArray[1].length);
        System.out.println(notSoSimpleArray[2].length);

    }
}
