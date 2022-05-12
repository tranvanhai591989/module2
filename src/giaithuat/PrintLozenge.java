package giaithuat;

import java.util.Scanner;

public class PrintLozenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the the height");
        int height = scanner.nextInt();
        int count = 0;
        int less = height;
        for (int i = 1; i < height; i++) {
            for (int j = -height; j <= height ; j++) {
                if (j==i || i==-j){
                    System.out.print(i);
                } else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = height-2; i >0; i--) {
            for (int j = -height; j <= height ; j++) {
                if (j==i || i==-j){
                    System.out.print(i);
                } else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
