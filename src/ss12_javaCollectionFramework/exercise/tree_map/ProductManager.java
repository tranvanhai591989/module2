package ss12_javaCollectionFramework.exercise.tree_map;

import java.util.Comparator;

public class ProductManager implements Comparator<ProductManager> {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String Production;

    public ProductManager() {
    }

    public ProductManager(int id, String name, int price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        Production = production;
    }

    @Override
    public String toString() {
        return
                "\n" + " id=" + id +
                        ", name=" + name +
                        ", price=" + price +
                        ", amount=" + amount +
                        ", Production=" + Production
                ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction(String production) {
        return Production;
    }

    public void setProduction(String production) {
        Production = production;
    }

    @Override
    public int compare(ProductManager o1, ProductManager o2) {
        return 0;
    }
}
