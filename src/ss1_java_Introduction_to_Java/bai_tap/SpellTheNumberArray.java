package ss1_java_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class SpellTheNumber {
    private static final String[] ONES = {null, "one", " Two", " Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] TEENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {null, null, "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String spellTheNumber(int number) {
        if (number < 10) {
            return ONES[number]; // như js xác định vị trí của biến trong mảng để gọi tên
        } else if (number < 20) {
            return TEENS[number % 10];
        } else if (number < 100) {
            return TENS[number / 10] + ((number % 10 > 0) ? " " + spellTheNumber(number % 10) : "");

        } else if (number < 1000) {
            return ONES[number / 100] + "Hundred" + ((number % 100 > 0) ? " " + spellTheNumber(number % 100) : "");
        }
        return spellTheNumber(number / 1000) + "Thousand" + ((number % 1000 > 0) ? " " + spellTheNumber(number % 1000) : " ");
    }

    public static void main(String[] args) {
        int num;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("数字を入力してください : "); // báo người dùng nhập số
            num = scanner.nextInt();
            if (num >= 1 && num <= 10000) {
                System.out.println(spellTheNumber(num));
            } else {
                System.out.println("数字はここがありませ");
            }
        } while (num <= 0 || num > 10000);

    }
}

