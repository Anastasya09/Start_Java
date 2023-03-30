package Lesson12;

public class Triangle extends TwoDShape {

    String style;

    Triangle(double width, double height) {
        super(width, height);
        this.color = "uncolored";
    }

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    void showColor () {

        System.out.println("The triangle is " + style);
    }
    double area() {
        return getWidth() * getHeight()/2;
    }
//    void itsFinal() {
//        System.out.println("FINAL");
//    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", style='" + style + '\'' +
                '}';
    }
}
