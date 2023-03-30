package Lesson12;

abstract class TwoDShape {

     private double width;
     private double height;
     static final String TYPE = "it is unchangeable";
    String color;

    TwoDShape(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

//    TwoDShape() {}

    void showDim() {
        System.out.println("Width and height are equal to "
                + width + " " + height);
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
    abstract double area();
    final void itsFinal() {
        System.out.println("FINAL");
    }

    @Override
    public String toString() {
        return "TwoDShape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
