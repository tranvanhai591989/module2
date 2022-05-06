package ss2_array.practice;

import java.util.Scanner;

public class MaxDivisorUocSo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("a を　入力してください: ");
        a = input.nextInt();
        System.out.println("b を　入力してください: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println(" 共通の最多数　が　ありません");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("共通の最多数 は　: " + a);
    }

}
