package ss2_array.practice;

import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Money moment");
        double money = scanner.nextDouble();
        System.out.println("Month");
        double month = scanner.nextDouble();
        System.out.println("Interest rate");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println(totalInterest);
    }
}
