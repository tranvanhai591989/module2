package ss5_accessModifier_metthod_static_property.Exercise.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        circle.display();
        System.out.println("Input the Radius : ");
        double radius = scanner.nextDouble();
        System.out.println("Input the Color : ");
        String color = scanner.next();
        circle.setRadius(radius);
        circle.setColor(color);
        circle.display();
    }
}
