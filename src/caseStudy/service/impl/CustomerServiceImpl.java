package caseStudy.service.impl;

import caseStudy.person.Customer;
import caseStudy.service.CustomerService;
import caseStudy.ultil.FormatString;
import caseStudy.ultil.ReadAndWrite;

import java.io.IOException;
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
    public void add() throws IOException {
        customer = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\customer.csv");
        customersList.clear();
        for (String[] item : customer) {
            Customer customer = new
                    Customer(item[0], item[1], item[2], Integer.parseInt(item[3]),
                    item[4], item[5], item[6], item[7]);
            customersList.add(customer);
        }
        if (customersList.isEmpty()) {
            customerID = 1;
        } else {
            customerID = customersList.get(customersList.size() - 1).getId() + 1;
        }

        String firstNameAndLastName;
        do {
            System.out.println("Input Name  : (Ex : Jon Smith) ");
            firstNameAndLastName = scanner.nextLine();
            if (FormatString.formatName(firstNameAndLastName)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);



        String dayOfBirth;
        do {
            System.out.println("Input birthday  : (Ex : dd/MM/yyyy) ");
            dayOfBirth = scanner.nextLine();
            if (FormatString.dateFormat(dayOfBirth)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);

        String gender;
        do {
            System.out.println("Input gender  : (Ex : Male|Female|Other) ");
            gender = scanner.nextLine();
            if (FormatString.formatGender(gender)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);


        String phoneNumber;
        do {
            System.out.println("Input phone number : (Ex : +84707498777) ");
            phoneNumber = scanner.nextLine();
            if (FormatString.formatPhone(phoneNumber)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);


        String email;
        do {
            System.out.println("Input Email : (Ex : abc123@gmail.com) ");
            email = scanner.nextLine();
            if (FormatString.formatEmail(email)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);


        String customerCode ;
        do {
            System.out.println("Input Customer code : (Ex : CMID-0000 ) ");
            customerCode = scanner.nextLine();
            if (FormatString.code(customerCode)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);



        Customer customer = new Customer(firstNameAndLastName, dayOfBirth, gender, customerID, phoneNumber, email, customerCode, getTypeOfCustomer());
        customersList.add(customer);
        String line = customer.getInfo();
        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\customer.csv", line);
        System.out.println("Add successful");
    }


    @Override
    public void display() {
        customer = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\customer.csv");
        customersList.clear();
        for (String[] item : customer) {
            Customer customer = new
                    Customer(item[0], item[1], item[2], Integer.parseInt(item[3]),
                   item[4], item[5], item[6], item[7]);
            customersList.add(customer);
        }
        System.out.println("----Customer List----");
        for (Customer item:customersList) {
            System.out.println(item);
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

                String firstNameAndLastName;
                do {
                    System.out.println("Input Name  : (Ex : Jon Smith) ");
                    firstNameAndLastName = scanner.nextLine();
                    if (FormatString.formatName(firstNameAndLastName)) {
                        break;
                    } else {
                        System.out.println("Wrong Format Input");
                    }
                } while (true);



                String dayOfBirth;
                do {
                    System.out.println("Input birthday  : (Ex : dd/MM/yyyy) ");
                    dayOfBirth = scanner.nextLine();
                    if (FormatString.dateFormat(dayOfBirth)) {
                        break;
                    } else {
                        System.out.println("Wrong Format Input");
                    }
                } while (true);

                String gender;
                do {
                    System.out.println("Input gender  : (Ex : Male|Female|Other) ");
                    gender = scanner.nextLine();
                    if (FormatString.formatGender(gender)) {
                        break;
                    } else {
                        System.out.println("Wrong Format Input");
                    }
                } while (true);


                String phoneNumber;
                do {
                    System.out.println("Input phone number : (Ex : +84707498777) ");
                    phoneNumber = scanner.nextLine();
                    if (FormatString.formatPhone(phoneNumber)) {
                        break;
                    } else {
                        System.out.println("Wrong Format Input");
                    }
                } while (true);


                String email;
                do {
                    System.out.println("Input Email : (Ex : abc123@gmail.com) ");
                    email = scanner.nextLine();
                    if (FormatString.formatEmail(email)) {
                        break;
                    } else {
                        System.out.println("Wrong Format Input");
                    }
                } while (true);

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
