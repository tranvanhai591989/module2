package ss2_array.exercise;

public class First20PrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        while (number<100) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
            }
            number++;
        }
    }
}
