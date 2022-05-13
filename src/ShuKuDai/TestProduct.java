package ShuKuDai;

import java.util.Scanner;

public class TestProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static int count;
    public static Product[] productlist = new Product[100];

    static {
        productlist[0] = new Product(1, " Iphone", 100, 12, "Apple");
        productlist[1] = new Product(2, " v", 100, 12, "SS");
        productlist[2] = new Product(3, " c", 100, 12, "CC");
        productlist[3] = new Product(4, " cv", 100, 12, "DD");
        count = 4;
    }

    public static void display() {

        for (Product item : productlist) {
            if (item != null) {
                System.out.println(item.toString());
            }
        }
    }

    public static void addProduct() {

        System.out.println("Input name :");
        String name = scanner.nextLine();
        System.out.println("Input Price :");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Input amount :");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Input production :");
        String production = scanner.nextLine();
        Product products = new Product(count + 1, name, price, amount, production);
        productlist[count] = products;
        count++;
    }

    public static void update() {
        System.out.println("Enter ID :");
        int id = Integer.parseInt(scanner.nextLine());
        Product products;
        for (int i = id - 1; i < productlist.length; i++) {
            System.out.println("Input name :");
            String name = scanner.nextLine();
            System.out.println("Input Price :");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Input amount :");
            int amount = Integer.parseInt(scanner.nextLine());
            System.out.println("Input production :");
            String production = scanner.nextLine();
            products = new Product(id, name, price, amount, production);
            productlist[id - 1] = products;
            break;
        }
    }

    public static void find() {
        int temp = 0;
        System.out.println("Input the chart");
        System.out.println();
        String chart = scanner.nextLine();
        int count = 0;
        for (Product product : productlist) {
            if (product != null && product.getName().contains(chart)) {
                System.out.println(product);
                System.out.println(count);
                temp++;
            }
            count++;
        }
        if (temp == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println();
        System.out.println();
    }

    public static void delete() {
        System.out.println("Enter ID :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = id-1; i <productlist.length -1; i++) {
            productlist[i]=productlist[i+1];
        }
    }


    public static void main(String[] args) {
        do {
            display();
            System.out.println(" ---------------ProductList-------------");
            System.out.println("1 - Add Product \n" +
                    "2 - Update product\n" +
                    "3 - Find product \n" +
                    "4 - Delete product\n" +
                    "5 - Exit ");
            System.out.print("You choose :");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
