package ss11_dsa_stack_queue.exercise.useTreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class UsedTreeMapCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Enter the text !!!");
        String text = scanner.nextLine();
        String[] string = text.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (treeMap.containsKey(string[i])) { // containsKey() trả về kết qua true/false
                treeMap.put(string[i], treeMap.get(string[i]) + 1);
            } else {
                treeMap.put(string[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}
