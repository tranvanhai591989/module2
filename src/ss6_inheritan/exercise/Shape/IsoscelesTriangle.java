package ss6_inheritan.exercise.Shape;

public class IsoscelesTriangle extends Shape {
    public IsoscelesTriangle() {

    }

    public IsoscelesTriangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "side=" + side1 +
                ",Perimeter = " + getPerimeter() +
                ", Area =" + getArea() +
                '}';
    }
}
