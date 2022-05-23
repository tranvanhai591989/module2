package ss12_javaCollectionFramework.exercise.tree_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductSystem extends ProductManager implements InterfaceMethod  {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<ProductManager> productList = new ArrayList<ProductManager>();
    public static int countId = 6;

    static {
        productList.add(new ProductManager(1, "hai", 1000, 500, "VietNam"));
        productList.add(new ProductManager(2, "tam", 1500, 1500, "Korea"));
        productList.add(new ProductManager(3, "duc", 1300, 800, "USA"));
        productList.add(new ProductManager(4, "dat", 1100, 750, "Japan"));
        productList.add(new ProductManager(5, "hung", 2000, 600, "China"));

    }

    public ProductSystem() {

    }

    @Override
    public void addProduct() {
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Production : ");
        String production = scanner.nextLine();
        System.out.println("Enter Price :");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Amount :");
        int amount = Integer.parseInt(scanner.nextLine());
        productList.add(new ProductManager(countId, name, price, amount, production));
        countId++;
    }

    @Override
    public void editProduct() {
        displayProduct();
        System.out.println("Enter your Id you want Edit!!!");
        int id = Integer.parseInt(scanner.nextLine());
        for (ProductManager productManager : productList) {
            if (productManager.getId() == id) {
                System.out.println("Enter Name : ");
                String name = scanner.nextLine();
                System.out.println("Enter Production : ");
                String production = scanner.nextLine();
                System.out.println("Enter Price :");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Amount :");
                int amount = Integer.parseInt(scanner.nextLine());
                productManager.setName(name);
                productManager.setAmount(amount);
                productManager.setPrice(price);
                productManager.setProduction(production);
                break;
            }
        }
        displayProduct();
    }

    @Override
    public void findProduct() {
        System.out.println("Enter the keyword you want find :");
        String keyWord = scanner.nextLine();
        boolean flag = true;
        for (ProductManager productManager : productList) {
            if (productManager.getName().contains(keyWord)) {
                System.out.println(productManager);
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteProduct() {
        displayProduct();
        System.out.println("Input the Id you want delete !");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
        displayProduct();

    }

    @Override
    public void displayProduct() {
        System.out.println(productList.toString());

    }

    @Override
    public void rangerIncreasePrice() {
        Collections.sort(productList, new Comparator<ProductManager>() {
            @Override
            public int compare(ProductManager o1, ProductManager o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        displayProduct();
    }

    @Override
    public void rangerReductionPrice() {
        productList.sort((o1, o2) ->o2.getPrice()-o1.getPrice() );
        displayProduct();
    }
//    -> arrows(dấu mũi tên)

    @Override
    public void returnMainMenu() {

    }

}
