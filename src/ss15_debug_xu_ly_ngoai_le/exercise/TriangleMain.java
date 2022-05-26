package ss15_debug_xu_ly_ngoai_le.exercise;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        boolean flag = false;
        do {
            flag = false;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter triangle Edge a");
                double a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter triangle Edge b");
                double b = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter triangle Edge b");
                double c = Integer.parseInt(scanner.nextLine());
                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new TriangleException("Đây không phải 3 cạnh của tam giác");
                } else if (a + b < c || b + c < a || a + c < b) {
                    throw new TriangleException("Đây không phải 3 cạnh của tam giác");
                }else {
                    System.out.println("a : "+ a +" ,b : "+b+" ,c : "+ c +" is triangle edge");
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Giá trị nhập vào không phải cạnh của tam giác! Bạn nhập lại đi!!");
                flag = true;
            } catch (TriangleException e) {
                System.out.println();
                System.out.println("Bạn nhập lại đi !!");
                flag = true;
            }


        } while (flag) ;


    }
}


