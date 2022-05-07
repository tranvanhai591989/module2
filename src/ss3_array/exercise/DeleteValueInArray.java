package ss3_array.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arr length");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Input the Index" + i);
            arr[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you want to delete");
        int xoa = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            if (xoa == arr[i]) {
                for (int j = i; j < arrLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
                i--;
                arr[arr.length - count] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

