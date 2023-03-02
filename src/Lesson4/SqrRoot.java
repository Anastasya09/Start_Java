package Lesson4;

public class SqrRoot {

    public static void main(String[] args) {

        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root from " + num + " is equal to " + sroot);
            rerr = num - (sroot*sroot);
            System.out.println("Rounding error is equal to " + rerr);
            System.out.println();
        }
    }
}
