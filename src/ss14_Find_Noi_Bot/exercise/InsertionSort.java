package ss14_Find_Noi_Bot.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Set the size");
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;

            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;

            System.out.println("Ranger Step : " + i + " -- " + Arrays.toString(arr));
        }
    }
}
