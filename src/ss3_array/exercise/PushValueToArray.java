package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PushValueToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 2; i < arr.length - 2; i++) {
            System.out.println("Input the Index" + i);
            arr[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index you want add");
        int index = scanner.nextInt();
        System.out.println("Enter the value you want add");
        int value = scanner.nextInt();

        for (int j = arr.length-1; j > index; j--) {
            arr[j] = arr[j - 1];
        }
        arr[index] = value;
        System.out.println(Arrays.toString(arr));
    }
}

