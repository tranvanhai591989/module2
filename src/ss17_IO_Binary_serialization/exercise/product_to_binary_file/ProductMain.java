package ss17_IO_Binary_serialization.exercise.product_to_binary_file;

import java.util.Scanner;

public class ProductMain {
    public static Scanner scanner = new Scanner(System.in);
    public static ProductSystem productSystem = new ProductSystem();

    public static void main(String[] args) {

        do {
            try {
                System.out.println("-------Product-----\n" +
                        "1. Display\n" +
                        "2. Add product\n" +
                        "3. Search\n" +
                        "Your choose");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        productSystem.display();
                        break;
                    case 2:
                        productSystem.add();
                        break;
                    case 3:
                        productSystem.display();
                        productSystem.search();
                        break;
                    case 4:
                        System.exit(0);

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (true);

    }
}
