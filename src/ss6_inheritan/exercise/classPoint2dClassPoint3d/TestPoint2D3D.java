package ss6_inheritan.exercise.classPoint2dClassPoint3d;

import java.util.Scanner;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x :");
        float x = scanner.nextFloat();
        System.out.println("Input y :");
        float y = scanner.nextFloat();
        Point2D point2D = new Point2D();
        point2D = new Point2D(x, y);
        System.out.println(point2D);
        System.out.println("Input z :");
        float z = scanner.nextFloat();
        Point3D point3D = new Point3D();
        point3D = new Point3D(x, y, z);
        System.out.println(point3D);
    }
}
