package ss6_inheritan.exercise.Shape;

import java.util.Scanner;

public class TestIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        System.out.println("Input the side");
        double side = scanner.nextDouble();
        isoscelesTriangle = new IsoscelesTriangle(side, side, side);
        isoscelesTriangle.getArea();
        isoscelesTriangle.getPerimeter();
        System.out.println(isoscelesTriangle.toString());
    }
}
