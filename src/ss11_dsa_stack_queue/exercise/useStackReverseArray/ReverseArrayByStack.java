package ss11_dsa_stack_queue.exercise.useStackReverseArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayByStack {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Array : " + Arrays.toString(arr));

        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        System.out.println("Stack :" + stack.toString());
        for (int i = 0; i < arr.length; i++) {
            stack.pop();
        }
        System.out.println("Stack :" + stack.toString());
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.add(arr[i]);
        }

        System.out.println("Stack :" + stack);
        String chart = "zxcvbnm";
        char[] arr2 = chart.toCharArray();

        System.out.println(arr2);

        Stack<Character> stackChar = new Stack<>();
        for (char c : arr2) {
            stackChar.push(c);
        }

        System.out.println("Stack :" + stackChar.toString());
        for (int i = 0; i < arr2.length; i++) {
            stackChar.pop();
        }
        System.out.println("Stack :" + stackChar.toString());
        for (int i = arr2.length - 1; i >= 0; i--) {
            stackChar.add(arr2[i]);
        }
        System.out.println("Stack :" + stackChar);

    }

}

