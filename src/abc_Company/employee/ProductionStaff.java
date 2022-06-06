package abc_Company.employee;

public class ProductionStaff extends Employee {
    private int countProduct;
    private int priceProduct;

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public ProductionStaff() {
    }

    @Override
    public String toString() {
        return "Product Staff Name : "+ getName()+
                " ,Id :  "+ getId()+
                " ,Code : "+ getCode()+
                " ,Birthday  "+ getBirthday()+
                " ,Address  "+ getAddress()+
                " ,Moment  "+ getCountProduct()+
                " ,Price  "+ getPriceProduct();
    }

    public ProductionStaff(int id, String code, String name, String birthday, String address, int countProduct, int priceProduct) {
        super(id, code, name, birthday, address);
        this.countProduct = countProduct;
        this.priceProduct = priceProduct;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCode(),
                super.getName(),
                super.getBirthday(),
                super.getAddress(),
                getCountProduct(),
                getPriceProduct());
    }


}
