package giaithuat;

import java.util.Scanner;

public class InHinhThoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the the height");
        int height = scanner.nextInt();
        int count = 0;
        int less = height - 1;
        System.out.println(less);
        for (int i = 0; i < height; i++) {
            count++;
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(count);
            for (int k = 0; k < count; k++) {
                System.out.print(" " + " ");
            }
            System.out.println(count);
        }
        for (int z = 0; z < height - 1; z++) {
            for (int x = height - less; x >= 0; x--) {
                System.out.print(" ");
            }
            System.out.print(less);
            for (int c = 0; c < height - z - 1; c++) {
                System.out.print(" " + " ");
            }
            System.out.println(less);
            less--;
        }
    }

}
