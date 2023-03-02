package Lesson4;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
//        int x;
//
//        for (x=0; x<6; x++) {
//            if (x==1)
//                System.out.println("x is equal to 1");
//            else if (x==2)
//                System.out.println("x is equal to 2");
//            else if (x==3)
//                System.out.println("x is equal to 3");
//            else if (x==4)
//                System.out.println("x is equal to 4");
//            else System.out.println("x is " + x + " and out of range 1 - 4");
//        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first letter of the day ");

        char ch1 = input.next().charAt(0);
        int ch2;

        switch (ch1) {
            case 'M' :
                System.out.println("This is Monday");
                System.out.println("It is a work day. But dependant on the daytime it may be your free time. Enter the time: ");
                ch2 = input.nextInt();
                switch (ch2) {
                    case 8:
                        System.out.println("You are still at work");
                        break;
                    case 20:
                        System.out.println("You are already at home");
                }
                break;
            case 'S' :
                System.out.println("This is Sunday, it is weekend");
                break;
        }
    }
}
