package ss4_class_object.exercise.runwatch;

import java.util.Arrays;

public class MainRunWatch {

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Array : "+Arrays.toString(arr));
        RunWatch runWatch=new RunWatch();
        runWatch.start();
        sort(arr);
        runWatch.stop();
        System.out.println("Ranger : "+ Arrays.toString(arr));
        System.out.println("Timer : "+runWatch.getElapsedTime());

    }

    public static void sort(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
}
