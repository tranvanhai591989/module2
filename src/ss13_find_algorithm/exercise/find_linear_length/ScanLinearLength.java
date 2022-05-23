package ss13_find_algorithm.exercise.find_linear_length;

import java.util.LinkedList;
import java.util.Scanner;

public class ScanLinearLength {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the text you want scan ");
        String text = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(text.charAt(i));
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) > list.getLast()) {
                    list.add(text.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
