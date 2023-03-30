package Lesson12;

public class TriangleIndependent {

    private double width;
    private double height;
    String color;

    TriangleIndependent(double width, double height) {
        setWidth(width);
        setHeight(height);
        this.color = color;
    }

    void showDim() {
        System.out.println("Width and height are equal to "
                + width + " " + height);
    }

    void showColor () {

        System.out.println("The triangle is " + color);
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = Math.abs(width);
    }
    public void setHeight(double height) {
        this.height = Math.abs(height);
    }
}
