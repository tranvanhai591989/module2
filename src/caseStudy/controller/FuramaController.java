package caseStudy.controller;

import caseStudy.models.service.impl.CustomerServiceImpl;
import caseStudy.models.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        CustomerServiceImpl customerServiceIml = new CustomerServiceImpl();

        do {
            System.out.println("1. Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Your choose : ");
            int chanel = Integer.parseInt(scanner.nextLine());
            switch (chanel) {
                case 1:
                    do {
                        System.out.println("1. Display list employees\n" +
                                "2. Add new employee\n" +
                                "3. Edit employee\n" +
                                "4. Return main menu\n" +
                                "Your choose : ");
                        int chanel1 = Integer.parseInt(scanner.nextLine());
                        switch (chanel1) {
                            case 1:
                                employeeServiceImpl.display();
                                break;
                            case 2:
                                employeeServiceImpl.add();
                                employeeServiceImpl.display();
                                break;
                            case 3:
                                employeeServiceImpl.delete();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (true);
                case 2:
                    do {
                        System.out.println("1. Display list customers\n" +
                                "2. Add new customer\n" +
                                "3. Edit customer\n" +
                                "4.Return main menu\n" +
                                "Your choose : ");
                        int choose2 = Integer.parseInt(scanner.nextLine());
                        switch (choose2) {
                            case 1:
                                customerServiceIml.display();
                                break;
                            case 2:
                                customerServiceIml.add();
                                break;
                            case 3:
                                customerServiceIml.update();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (true);
                case 3:
                    do {
                        System.out.println("1. Display list facility\n" +
                                "2. Add new facility\n" +
                                "3.Display list facility maintenance\n" +
                                "4. Return main menu\n" +
                                "Your choose : ");
                        int choose3 = Integer.parseInt(scanner.nextLine());
                        switch (choose3) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                ;
                                break;
                            case 4:
                                break;
                        }

                    } while (true);

                case 6:
                    System.exit(0);

            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}


//                    case 3:
//                        do {
//                            System.out.println("1. Display list facility\n" +
//                                    "2. Add new facility\n" +
//                                    "3.Display list facility maintenance\n" +
//                                    "4. Return main menu\n" +
//                                    "Your choose : ");
//                    int choose3 = Integer.parseInt(scanner.nextLine());
//                    switch (choose3) {
////                    case 1:displayListFacility();break;
////                    case 2:addNewFacility();break;
////                    case 3:displayListFacilityMaintenance();break;
//                        case 4:
//                            break;
//                    }
//
//                } while (true);

//            case 4:
//                System.out.println(
//                        "1.\tAdd new booking\n" +
//                                "2.\tDisplay list booking\n" +
//                                "3.\tCreate new constracts\n" +
//                                "4.\tDisplay list contracts\n" +
//                                "5.\tEdit contracts\n" +
//                                "6.\tReturn main menu\n" +
//                                "Your choose : ");
//                int choose4 = Integer.parseInt(scanner.nextLine());
//                switch (choose4) {
//                    case 1:addNewBooking();break;
//                    case 2:displayListBooking();break;
//                    case 3:createNewContracts();break;
//                    case 4:displayListContracts();break;
//                    case 5:editContracts();break;
//                    case 6:
//                        break;
//
//                }
//                while (true) ;
//
//
//            case 5:
//                System.out.println("1. Display list customers use service\n" +
//                        "2. Display list customers get voucher\n" +
//                        "3. Return main menu\n" +
//                        "Your choose : ");
//                int choose5 = Integer.parseInt(scanner.nextLine());
//                switch (choose5) {
////                    case 1:displayListCustomersUseService();break;
////                    case 2:displayListCustomersGetVoucher();break;
//                    case 3:
//                        break;
//                }
////                while (true) ;
//            case 6:
//                System.exit(0);