package ss11_dsa_stack_queue.exercise.kiem_tra_dau_ngoac_don;

import java.util.*;

public class CheckParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Input text");
        String text = scanner.nextLine();// ())
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                bStack.push(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("False");
                    flag = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (flag && bStack.isEmpty()) {
            System.out.println("True");
        } else if (!bStack.isEmpty()) {
            System.out.println("False");
        }
    }
}
