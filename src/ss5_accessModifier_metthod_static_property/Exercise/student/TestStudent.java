package ss5_accessModifier_metthod_static_property.Exercise.student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Input the Name : ");
        String name = scanner.nextLine();
        System.out.println("Input the ClassName : ");
        String className = scanner.nextLine();
        student.setName(name);
        student.setClassName(className);
        student.display();
    }
}
