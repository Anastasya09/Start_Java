package Homeworks_Java;

import java.util.Scanner;

public class L2HW_Sound {

    public static void main(String[] args) {
        double echotime;
        double lightningtime;

        Scanner input = new Scanner(System.in);

        System.out.println("Сколько времени в секундах прошло между вспышкой молнии и ударом грома?");
        lightningtime = input.nextDouble();
        System.out.println("Сколько времени в секундах прошло до того, как вы услышали эхо?");
        echotime = input.nextDouble();

        double lightningdist = 343 * lightningtime;

        double objectdist = 343 * echotime/2.0;

        System.out.println("Расстояние до места удара молнии составляет " + lightningdist + "метров");
        System.out.println("Расстояние до объекта составляет " + objectdist + "метров");
    }
}
