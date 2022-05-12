package ss4_class_object.exercise.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("First root: " + quadraticEquation.getRoot1());
            System.out.println("Second root: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}
