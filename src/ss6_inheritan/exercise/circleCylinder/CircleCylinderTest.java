package ss6_inheritan.exercise.circleCylinder;

public class CircleCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(3, "Green");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3, "Blue", 5);
        System.out.println(cylinder);

    }
}
