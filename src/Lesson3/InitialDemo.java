package Lesson3;

public class InitialDemo {

    public static void main(String[] args) {
        int i;
        i = 8;
        int x, y, z;
        x = y = z = 100;

        // x <operator>= <value>; is the SAME as
        // x = x <operator> <value>;

        System.out.println("initial value of x: " +x);// 100

        x += 10; // same as  x = x + 10 and same as x++
        System.out.println("Value of x after x += 10: " +x);// 110

        x -= 10; // same as x = x - 10 and same as --x
        System.out.println("Value of x after x -= 10: " +x);// 100

        x *= 10; // same as x = x * 10
        System.out.println("Value of x after x *= 10: " +x);// 1000

        x /= 10; // same as x = x / 10
        System.out.println("Value of x after x /= 10: " +x);// 100

        x %= 10; // same as x = x / 10
        System.out.println("Value of x after x %= 10: " +x);// 0

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("initial value of b1: " +b1);// true

        b1 &= b2; // same as b1 = b1 & b2;
        System.out.println("Value of b1 after b1 &= b2: " +b1);// false
        b1 |= b2;
        System.out.println("Value of b1 after b1 |= b2: " +b1);// false
        b1 ^= b2;
        System.out.println("Value of b1 after b1 ^= b2: " +b1);// false

        y = 0;
        y++;
        System.out.println("y = " + y);




    }
}
