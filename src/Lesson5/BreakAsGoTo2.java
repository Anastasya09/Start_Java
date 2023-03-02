package Lesson5;

public class BreakAsGoTo2 {

    public static void main(String[] args) {

        done:
           for(int i=0; i<13; i++) {
               System.out.println((i+1) + " month ");
               for(int j=0; j<5; j++) {
                   System.out.println((j+1) + " week ");
                   for(int k=0; k<8; k++) {
                       System.out.println((k+1) + " day ");
//                       if (k == 1) break;
                   }
                   System.out.println("After loop with counter k");
               }
               System.out.println("After loop with counter j");
           }
        System.out.println("After loop with counter i");
    }
}
