package giaithuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class RangerTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dàu mảng");
        int length = Integer.parseInt(scanner.nextLine());
       int [] arrayList = new int[length];
        System.out.println("Nhập các số và ngăn cách bằng -1");
        System.out.println("Enter " + arrayList.length + " values:");
        for (int i = 0; i < length; i++) {
            arrayList[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: " + arrayList.toString());

        System.out.println("\nBegin sort processing...");
            bubbleSortByStep(arrayList);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]&& list[i]!=-1) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

