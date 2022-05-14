package ss7_AbstractClass_Interface.Exercise2;


import java.util.Scanner;

public class TotalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Length");
        double length = scanner.nextInt();
        System.out.println("Set width");
        double width = scanner.nextInt();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(length, "Green", true);
        shapes[1] = new Rectangle(width, length, "black", true);
        shapes[2] = new Square("Green", true, width);
        for (int i = 0; i <shapes.length ; i++) {
            System.out.println(shapes[i].getArea());
            if (shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor() ;
            }
        }

    }
}
