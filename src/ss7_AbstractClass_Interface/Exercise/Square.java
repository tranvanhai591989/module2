package ss7_AbstractClass_Interface.Exercise;

public class Square extends Shape implements Resizeable {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public Square(double width,String color, boolean filled) {
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
        return "Square Area : " +
                 getArea() ;
    }

    @Override
    public void resize(double percent) {
        this.width = width * percent;
    }
}
