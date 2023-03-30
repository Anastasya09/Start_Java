package Lesson12;

public class ColoredTriangle extends Triangle {

    String color;

    ColoredTriangle(double width, double height, String style, String color) {
        super(width, height, style);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredTriangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
