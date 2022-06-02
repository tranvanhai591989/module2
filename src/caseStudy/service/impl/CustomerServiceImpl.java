package caseStudy.service.impl;

import caseStudy.person.Customer;
import caseStudy.person.Employee;
import caseStudy.service.CustomerService;
import caseStudy.ultil.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String[]> customer = new ArrayList<>();
    public static LinkedList<Customer> customersList = new LinkedList<Customer>();
    public static int customerID;

    @Override

    public void add() {
        customer = ReadAndWrite.readerFile("src\\caseStudy\\data\\customer.csv");
        customersList.clear();
        for (String[] item : customer) {
            Customer customer = new
                    Customer(item[0], Integer.parseInt(item[1]), item[2], Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), item[7]);
//            (String firstNameAndLastName, int dayOfBirth, String gender, int id, int phoneNumber,
//            String email, int customerCode, String typeOfCustomer)
            customersList.add(customer);
        }
        if (customersList.isEmpty()) {
            customerID = 1;
        } else {
            customerID = customersList.get(customersList.size() - 1).getId() + 1;
        }
        System.out.println("Input Name");
        String firstNameAndLastName = scanner.nextLine();

        System.out.println("Input Birthday (dd/MM/yyyy)");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());


        System.out.println("Input gender");
        String gender = scanner.nextLine();

        System.out.println("Input phone number:");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Input Email:");
        String email = scanner.nextLine();

        System.out.println("Input Employee Code :");
        int customerCode = Integer.parseInt(scanner.nextLine());

     

        customersList.add(new Customer(firstNameAndLastName, dayOfBirth, gender, customerID, phoneNumber, email, customerCode, getTypeOfCustomer()));
        //String firstNameAndLastName, int dayOfBirth, String gender,
        // int id, int phoneNumber, String email, int customerCode,
        // String typeOfCustomer)
    }


    @Override
    public void display() {
        customer = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        customersList.clear();
        for (String[] item: customer ) {
//            Customer customer = new Customer()
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {
        System.out.println("Input the id you want update:");
        int update = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customersList.size(); i++) {
            if (update == customersList.get(i).getId()) {

                System.out.println("Input name");
                String firstNameAndLastName = scanner.nextLine();

                System.out.println("Input Birthday (dd/MM/yyyy)");
                int dayOfBirth = Integer.parseInt(scanner.nextLine());

                System.out.println("Input gender (Male/Female) ");
                String gender = scanner.nextLine();

                System.out.println("Input phone number ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Input Email (abc123@gmail.com ) ");
                String email = scanner.nextLine();

                customersList.get(i).setFirstNameAndLastName(firstNameAndLastName);
                customersList.get(i).setDayOfBirth(dayOfBirth);
                customersList.get(i).setGender(gender);
                customersList.get(i).setPhoneNumber(phoneNumber);
                customersList.get(i).setEmail(email);
                customersList.get(i).setTypeOfCustomer(getTypeOfCustomer());
            }
        }

    }

    //String firstNameAndLastName, int dayOfBirth, String gender,
    // int id, int phoneNumber, String email, int customerCode,
    // String typeOfCustomer)

    @Override
    public void search() {

    }
}
