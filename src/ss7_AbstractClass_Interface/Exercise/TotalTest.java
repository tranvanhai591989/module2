package ss7_AbstractClass_Interface.Exercise;

import java.util.Scanner;

public class TotalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Length");
        double length = scanner.nextDouble();
        System.out.println("Set width");
        double width = scanner.nextDouble();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(length, "Blue", true);
        shapes[1] = new Rectangle(length, width, "Yellow", true);
        shapes[2] = new Square(width, "Green", true);

        for (Shape shape : shapes) {
            System.out.println("Before : " + shape + shape.getArea());
            shape.resize((Math.random() * 1.0));
            System.out.println("After  : " + shape + shape.getArea());
        }
    }
}
