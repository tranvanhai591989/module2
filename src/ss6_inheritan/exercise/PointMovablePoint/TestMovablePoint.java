package ss6_inheritan.exercise.PointMovablePoint;

import java.util.Scanner;

public class TestMovablePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();
        System.out.println("Input y: ");
        float y = scanner.nextFloat();
        System.out.println("Input xSpeed: ");
        float xSpeed = scanner.nextFloat();
        System.out.println("Input ySpeed: ");
        float ySpeed = scanner.nextFloat();
        Point point ;
        point =new Point(x,y);
        System.out.println(point);
        MovablePoint movablePoint;
        movablePoint = new MovablePoint(x, xSpeed, y, ySpeed);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

