package ss7_AbstractClass_Interface.Exercise2;


public class Square extends Rectangle implements Colorable {


    public Square() {
    }

    public Square(double width) {
        super(width, width);
    }

    public Square(double width, String color, boolean filled) {
        super(width,width, color, filled);
    }

    public double getArea() {
        return getWidth()*getWidth();
    }

    @Override
    public String toString() {
        return "Square Area " +getArea() ;
    }

    @Override
    public void howToColor() {
        System.out.println("Square Color all four sides ");
    }
}
