package ss17_IO_Binary_serialization.exercise.product_to_binary_file;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String production;
    private int price;
    private String otherInformation;

    public Product() {
    }

    public Product(int id, String name, String production, int price, String otherInformation) {
        this.id = id;
        this.name = name;
        this.production = production;
        this.price = price;
        this.otherInformation = otherInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", otherInformation='" + otherInformation + '\'' +
                '}';
    }
}
