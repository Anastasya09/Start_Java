package Lesson3;

public class IncrDecr {
    public static void main(String[] args) {

        int x = 0;

//        x = x + 1;
//        x++;
//        System.out.println("x = " + x);
//
//        x = x - 1;
//        x--;
//        System.out.println("x = " + x);

//        x = 10;
//        int y = ++x;
//
//        System.out.println("y = " + y);
//
//        y = x++;
//
//        System.out.println("y = " + y);
//        System.out.println("x = " + x);

        int d = 0;

        System.out.println("POSFIX INCREMENT BEHAVIOR");

        for ( int z = 0; z < 2; z++) {
            System.out.println("d = " + (d++));
        }

        System.out.println("not incremented in this line d = " + d);

        int d1 = 0;

        System.out.println("PREFIX INCREMENT BEHAVIOR");

        for ( int z = 0; z < 2; z++) {
            System.out.println("d = " + (++d1));
        }

        System.out.println("not incremented in this line d = " + d);



    }
}
