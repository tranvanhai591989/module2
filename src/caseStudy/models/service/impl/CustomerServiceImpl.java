package caseStudy.models.service.impl;

import caseStudy.models.person.Customer;
import caseStudy.models.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();
    public static int idCustomer = 1004;

    static {
        customerList.add(new Customer("Hoang", "Nam", "Hoang@gmail.com",
                "15/3/1991", 1001, 98745678, 1001, "Silver"));
        customerList.add(new Customer("Nam", "Nam", "nam@gmail.com",
                "15/3/1991", 1002, 98745678, 1002, "Platinium"));
        customerList.add(new Customer("Tuấn", "Nam", "tuan@gmail.com",
                "15/3/1991", 1003, 98745678, 1003, "Diamond"));
    }

    @Override
    public void add() {
        System.out.println(" Enter the name : ");
        String name = scanner.nextLine();
        System.out.println(" Enter the gender : ");
        String gender = scanner.nextLine();
        System.out.println(" Enter the email : ");
        String email = scanner.nextLine();
        System.out.println(" Enter the birthday : ");
        String birthday = scanner.nextLine();
        System.out.println(" Enter the phone number : ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        customerList.add(new Customer(name, gender, email, birthday, idCustomer, phoneNumber, idCustomer, getTypeCustomer()));
        idCustomer++;
    }

    @Override
    public void display() {
        for (Customer item : customerList) {
            System.out.println(item);
        }

    }

    @Override
    public void delete() {
        System.out.println("Input the Id you want delete");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customerList.remove(customerList.get(i));

            }
        }
    }
    @Override
    public void update () {
        System.out.println("Input the Id you want edit ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println(" Enter the name : ");
                String name = scanner.nextLine();
                System.out.println(" Enter the gender : ");
                String gender = scanner.nextLine();
                System.out.println(" Enter the email : ");
                String email = scanner.nextLine();
                System.out.println(" Enter the birthday : ");
                String birthday = scanner.nextLine();
                System.out.println(" Enter the phone number : ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                customer.setFirstNameLastName(name);
                customer.setGender(gender);
                customer.setEmail(email);
                customer.setDayOfBirth(birthday);
                customer.setPhoneNumber(phoneNumber);
                customer.getTypeCustomer();
            }
        }
    }
    @Override
    public void search () {

    }
}
