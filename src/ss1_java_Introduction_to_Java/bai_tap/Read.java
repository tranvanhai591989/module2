package ss1_javaintroduction.exercise;

import java.util.Scanner;

class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc ");
        int number = sc.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("số lơn hơn 3 chữ số hoặc đang là số âm");
        } else if (number >= 0 && number <= 9) {
            switch (number) {
                case 0:
                    System.out.print("không");
                    break;

                case 1:
                    System.out.println(" một.");
                    break;
                case 2:
                    System.out.println(" hai.");
                    break;
                case 3:
                    System.out.println(" ba.");
                    break;
                case 4:
                    System.out.println(" bốn.");
                    break;
                case 5:
                    System.out.println(" năm.");
                    break;
                case 6:
                    System.out.println(" sáu.");
                    break;
                case 7:
                    System.out.println(" bảy.");
                    break;
                case 8:
                    System.out.println(" tám.");
                    break;
                case 9:
                    System.out.println(" chín.");
                    break;
            }
        } else {
            switch (number / 100) {

                case 1:
                    System.out.print("Một trăm");
                    break;
                case 2:
                    System.out.print("Hai trăm");
                    break;
                case 3:
                    System.out.print("Ba trăm");
                    break;
                case 4:
                    System.out.print("Bốn trăm");
                    break;
                case 5:
                    System.out.print("Năm trăm");
                    break;
                case 6:
                    System.out.print("Sáu trăm");
                    break;
                case 7:
                    System.out.print("Bảy trăm");
                    break;
                case 8:
                    System.out.print("Tám trăm");
                    break;
                case 9:
                    System.out.print("Chín trăm");
                    break;
            }
            switch (((number / 10) * 10) % 100) {
                case 0:
                    System.out.print(" lẻ");
                    break;
                case 10:
                    System.out.print(" mười");
                    break;
                case 20:
                    System.out.print(" hai mươi");
                    break;
                case 30:
                    System.out.print(" ba mươi");
                    break;
                case 40:
                    System.out.print(" bốn mươi");
                    break;
                case 50:
                    System.out.print(" năm mươi");
                    break;
                case 60:
                    System.out.print(" sáu mươi");
                    break;
                case 70:
                    System.out.print(" bảy mươi");
                    break;
                case 80:
                    System.out.print(" tám mươi");
                    break;
                case 90:
                    System.out.print(" chín mươi");
                    break;
            }
            switch (number % 10) {
                case 0:
                    System.out.print("");
                    break;

                case 1:
                    System.out.println(" một.");
                    break;
                case 2:
                    System.out.println(" hai.");
                    break;
                case 3:
                    System.out.println(" ba.");
                    break;
                case 4:
                    System.out.println(" bốn.");
                    break;
                case 5:
                    System.out.println(" năm.");
                    break;
                case 6:
                    System.out.println(" sáu.");
                    break;
                case 7:
                    System.out.println(" bảy.");
                    break;
                case 8:
                    System.out.println(" tám.");
                    break;
                case 9:
                    System.out.println(" chín.");
                    break;
            }
//            switch (number == 0) {
//                case 0:
//                    System.out.println(" không");
//                    break;
//            }
        }
    }
}