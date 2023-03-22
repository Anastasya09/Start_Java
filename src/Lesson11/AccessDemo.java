package Lesson11;

import java.util.Scanner;

public class AccessDemo {
    public static void main(String[] args) {

        MyClass myClass = new MyClass(-6, 1, 5);


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter alpha:");
//        int candidateForAlphaValue = input.nextInt();
////        myClass.alpha = input.nextInt();
//        myClass.setAlpha(candidateForAlphaValue);
//        System.out.println("Enter beta:");
//        myClass.beta = input.nextInt();
//        myClass.gamma = 7;

//        System.out.println("alpha is equal to " + myClass.alpha());
        System.out.println("alpha is equal to " + myClass.getAlpha());
        System.out.println("beta is equal to " + myClass.beta);

//        System.out.println(myClass.calculateDivision());




    }
}
