package ss3_array.exercise;

import java.util.Scanner;

public class CountCharInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String");
        String sti = "dfajshdfkhkdkksdfkshhh";
        System.out.println(sti);

        System.out.println("Input the characters");
        String cha= scanner.nextLine();
        char[] ch= sti.toCharArray();
        char[] chacha=cha.toCharArray();

        int count =0;
        for (char c : ch) {
            if (chacha[0] == c) {
                count++;
            }

        }
        System.out.println(cha + " : có "+ count +" xuất hiện ");
    }

}
