package Lesson12;

public class Rectangle extends TwoDShape {

    Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double area() {
        return getWidth() * getHeight();
    }

    boolean isSquare() {
        return (getWidth() == getHeight()? true:false);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }


}
