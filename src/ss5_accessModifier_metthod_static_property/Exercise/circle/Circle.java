package ss5_accessModifier_metthod_static_property.Exercise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public  void display() {
        System.out.println("Radius : " + this.radius);
        System.out.println("Color : " + this.color);
        System.out.println("Circle Area : " + getArea());
    }
}
