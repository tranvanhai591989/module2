package ss11_dsa_stack_queue.exercise.checkPalindrome;

import java.util.*;

public class CheckPalindrome {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the char you want convert !");
        String chart = scanner.nextLine().toUpperCase();
        System.out.println(chart);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        char[] arr = chart.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            queue.add(arr[i]);
        }
        System.out.println("Stack : " + stack);
        System.out.println("Queue : " + queue);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (stack.pop().equals(queue.poll())) {
                flag = true;
            } else {
                break;
            }
        }
        if (flag) {
            System.out.println("The chart is palindrome");
        } else {
            System.out.println("The chart is not palindrome");
        }
    }
}
