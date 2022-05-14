package ss7_AbstractClass_Interface.Exercise2;


public class Square extends Shape implements Colorable {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Square Color all four sides ");
    }
}
