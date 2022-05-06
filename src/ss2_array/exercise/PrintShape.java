package ss2_array.exercise;

import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Print the rectangle");
        System.out.println("2 Print the square triangle");
        System.out.println("3 Print isosceles triangle");
        System.out.println("4 Exit");
        System.out.println("Change chanel");
        int Change = Integer.parseInt(scanner.nextLine());
        switch (Change) {
            case 1:
                System.out.println("Input the amount");
                int a = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Input the amount");
                int b = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i <= b; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= b; i++) {
                    for (int j = b; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = b; k > i; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 0; i < b; i++) {
                    for (int j = b - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Input the amount");
                int c = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < c; i++) {
                    for (int j = i; j < c - 1; j++) {
                        System.out.print(" ");

                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:break;
        }

    }
}

