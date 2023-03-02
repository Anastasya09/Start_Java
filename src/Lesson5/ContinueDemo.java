package Lesson5;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = -1;

//        for (i=0; i<=100; i++) {
//            if((i%2) != 0) continue;
//            System.out.println(i);
//        }

        while (i <= 100) {
            i++;
            if((i%2) != 0) continue;
            System.out.println(i);
        }

    }
}
