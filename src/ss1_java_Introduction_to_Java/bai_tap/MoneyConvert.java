package ss1_java_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args){    //phím tắt main + tab     >>>>public static void main
        int VND = 24500 ;
        int USD ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD : ");      //phím tắt sout + tab >>>System.out.print
        USD = scanner.nextInt();
        int convert = USD * VND;
        System.out.print("Convert to VND : "+ convert + " VND");
    }
}
