package ss6_inheritan.practice;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {

        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);

    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with Side :"
                + getSide()
//                +"Square Area : "
//                + getArea()
//                +"Square Perimeter : "
//                +getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
