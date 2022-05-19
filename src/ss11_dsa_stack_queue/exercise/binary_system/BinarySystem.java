package ss11_dsa_stack_queue.exercise.binary_system;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        int check = scanner.nextInt();
        int count = 0;
        while (check > 0) {
            stack.add(check % 2);
            count++;
            check = check / 2;
        }
        System.out.println(stack);
        for (int i = 0; i < count; i++) {
            stack1.add(stack.pop());
        }
        System.out.println(stack1);
    }
}
