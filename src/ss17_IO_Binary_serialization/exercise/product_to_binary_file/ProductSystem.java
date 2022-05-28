package ss17_IO_Binary_serialization.exercise.product_to_binary_file;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSystem extends Product implements ProductInterface {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
    public static int id;

//    static {
//        productList.add(new Product());
//        WriteAndRead.writeProduct("src\\ss17_IO_Binary_serialization\\exercise\\product_to_binary_file\\productList.txt", productList);
//    }
//
//    public static void main(String[] args) {
//
//    }

    @Override
    public void add() {
        productList = (List<Product>) WriteAndRead.readProduct("src\\ss17_IO_Binary_serialization\\exercise\\product_to_binary_file\\productList.txt");
        System.out.print("Input name");
        String name = scanner.nextLine();
        System.out.print("Input Production");
        String production = scanner.nextLine();
        System.out.print("Input otherInformation");
        String otherInformation = scanner.nextLine();
        System.out.println("Input Price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = null;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        productList.add(product = new Product(id, name, production, price, otherInformation));
        WriteAndRead.writeProduct("src\\ss17_IO_Binary_serialization\\exercise\\product_to_binary_file\\productList.txt", productList);
    }

    @Override
    public void display() {
        try {
            productList = (List<Product>) WriteAndRead.readProduct("src\\ss17_IO_Binary_serialization\\exercise\\product_to_binary_file\\productList.txt");
            for (Product e : productList) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search() {
        System.out.println("Input the name you want search");
        String key = scanner.nextLine();
        boolean flag = false;
        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(key)) {
                System.out.println(productList.get(i));
                flag = true;
            }
        }
        if (flag = true) {
            System.out.println("Not Found");
        }
    }
}
