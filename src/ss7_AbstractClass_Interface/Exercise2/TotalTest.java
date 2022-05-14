package ss7_AbstractClass_Interface.Exercise2;


import java.util.Scanner;

public class TotalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Length");
        double length = scanner.nextDouble();
        System.out.println("Set width");
        double width = scanner.nextDouble();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(length, "Green", true);
        shapes[1] = new Rectangle(width, length, "black", true);
        shapes[2] = new Square(width, "Grey", true);
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof Square) {
                ((Square) shape).howToColor();


            }
        }
    }
}
