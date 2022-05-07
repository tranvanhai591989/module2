package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the array length");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Input the value");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min in array : " + min);
    }
}
