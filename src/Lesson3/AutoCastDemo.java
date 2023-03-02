package Lesson3;

public class AutoCastDemo {
    public static void main(String[] args) {
        int i;

        float f;

        i = 10;

        f = i; //WIDENING CASTING was done automatically

        System.out.println(f);

//        i = f; WIDENING CASTING (the one which is done automatically) IS NOT POSSIBLE

        long l = 100;
        double d = l;

        i = (int) l;
        l = i;


    }
}
