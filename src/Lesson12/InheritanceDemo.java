package Lesson12;

public class InheritanceDemo {
    public static void main(String[] args) {


        Triangle t2 = new Triangle(2, 4, "uncolored");
        Rectangle r4 = new Rectangle(2, 4);

        System.out.println(t2);
        System.out.println(t2.area());
        System.out.println(r4);
        System.out.println(r4.area());

        System.out.println(TwoDShape.TYPE);

//        TwoDShape.TYPE = "let's try to change";


    }
}
