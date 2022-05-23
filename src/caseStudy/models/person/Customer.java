package caseStudy.models.person;

import caseStudy.models.service.CustomerService;

import java.util.Scanner;

public class Customer extends Person implements CustomerService {
    private int customerCode;
    private String typeCustomer;
    public static Scanner scanner = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String firstNameLastName, String gender, String email, String dayOfBirth, int id, int phoneNumber, int customerCode, String typeCustomer) {
        super(firstNameLastName, gender, email, dayOfBirth, id, phoneNumber);
        this.customerCode = customerCode;
        this.typeCustomer = typeCustomer;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeCustomer() {
        do {
            System.out.println("1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 5) {
                switch (chanel) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return " Member";

                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer - " + super.toString() +
                ", Code : " + customerCode +
                ", TypeCustomer : " + typeCustomer;
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
