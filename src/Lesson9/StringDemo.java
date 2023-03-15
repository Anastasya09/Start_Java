package Lesson9;

import Lesson6.Vehicle;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String str = new String("He llo");

//        Vehicle v1 = new Vehicle(1, 2, 3);
//        v1.

        String str2 = new String(str);

        System.out.println(str);
        System.out.println(str2);

        String str3 = "hello my friends";

        System.out.println(str3);

        if (str.equals(str2)) System.out.println("equals");
        else System.out.println("NOT EQUALS");

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.indexOf("my"));
        System.out.println(str3.lastIndexOf("my"));

        String str4 = str + str2 + str3;
        System.out.println(str4);

    }
}
