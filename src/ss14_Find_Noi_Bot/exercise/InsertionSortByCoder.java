package ss14_Find_Noi_Bot.exercise;

import java.util.Arrays;


public class InsertionSortByCoder {

    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 9, 8, 3, 2, 5, 7};
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;

            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;

            System.out.println("Step "+i+" "+Arrays.toString(arr));
        }
    }
}

