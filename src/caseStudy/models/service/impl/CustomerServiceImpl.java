package caseStudy.models.service.impl;

import caseStudy.models.person.Customer;
import caseStudy.models.service.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Customer> customerLinkedList = new LinkedList<>();
    public static int idCustomer = 1004;

    static {
        customerLinkedList.add(new Customer("Hoang", "Nam", "Hoang@gmail.com",
                "15/3/1991", 1001, 98745678, 1001, "Silver"));
        customerLinkedList.add(new Customer("Nam", "Nam", "nam@gmail.com",
                "15/3/1991", 1002, 98745678, 1002, "Platinum"));
        customerLinkedList.add(new Customer("Tuấn", "Nam", "tuan@gmail.com",
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
        customerLinkedList.add(new Customer(name, gender, email, birthday, idCustomer, phoneNumber, idCustomer, getTypeCustomer()));
        idCustomer++;
    }

    @Override
    public Customer display() {
        for (Customer item : customerLinkedList) {
            System.out.println(item.toString());
        }

        return null;
    }

    @Override
    public void delete() {
        System.out.println("Input the Id you want delete");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getId() == id) {
                customerLinkedList.remove(customerLinkedList.get(i));

            }
        }
    }

    @Override
    public void update() {
        System.out.println("Input the Id you want edit ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (customerLinkedList.get(i).getId() == id) {
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
                customerLinkedList.get(i).setFirstNameLastName(name);
                customerLinkedList.get(i).setGender(gender);
                customerLinkedList.get(i).setEmail(email);
                customerLinkedList.get(i).setDayOfBirth(birthday);
                customerLinkedList.get(i).setPhoneNumber(phoneNumber);
                customerLinkedList.get(i).setTypeCustomer(getTypeCustomer());
                break;
            }
        }
    }

    @Override
    public void search() {

    }
}
