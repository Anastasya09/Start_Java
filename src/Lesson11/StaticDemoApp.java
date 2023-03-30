package Lesson11;

public class StaticDemoApp {
    public static void main(String[] args) {

        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x & ob2.x are independent!");
        System.out.println("ob1.x : " + ob1.x);
        System.out.println("ob2.x : " + ob2.x);

        StaticDemo.y = 100;
        System.out.println("Changed StaticDemo.y to be equal to 100");
        System.out.println("ob1.sum() : " + ob1.sum());
        System.out.println("ob2.sum() : " + ob2.sum());
        System.out.println("valDiv2() : " + StaticDemo.valDiv2());
    }
}
