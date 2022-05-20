package ss12_javaCollectionFramework.exercise.tree_map;

import java.util.Scanner;

public class ControllerProduct {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductSystem productSystem = new ProductSystem();
        do {
            System.out.println("1. Add Product\n" +
                    "2. Edit Product\n" +
                    "3. Find Product\n" +
                    "4. Delete Product\n" +
                    "5. Display Product\n" +
                    "6. Sort Product\n" +
                    "7. Exit");
            int chanel = Integer.parseInt(scanner.nextLine());
            switch (chanel) {
                case 1:
                    productSystem.addProduct();
                    break;
                case 2:
                    productSystem.editProduct();
                    break;
                case 3:
                    productSystem.findProduct();
                    break;
                case 4:
                    productSystem.deleteProduct();
                    break;
                case 5:
                    productSystem.displayProduct();
                    break;
                case 6:
                    productSystem.displayProduct();
                    System.out.println("1. Ranger increase by price\n" +
                            "2. Ranger reduction by price\n" +
                            "3. Return MainMenu" +
                            "Your choose");
                    int chanel61 = Integer.parseInt(scanner.nextLine());
                    switch (chanel61) {
                        case 1:
                            productSystem.rangerIncreasePrice();
                            break;
                        case 2:
                            productSystem.rangerReductionPrice();
                            break;
                        case 3:
                            productSystem.returnMainMenu();
                            break;
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
