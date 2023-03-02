package Lesson2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x;

        x = 10;

        if (x==10) {
           int y = 20;

           x = y * 2;
        }
//        System.out.println(y);
        System.out.println("x is equal to 40");
    }
}
