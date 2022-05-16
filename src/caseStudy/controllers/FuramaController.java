//package caseStudy.controllers;
//
//import java.util.Scanner;
//
//public class FuramaController {
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void displayMainMenu() {
//        System.out.println("1. Employee Management\n" +
//                "2.Customer Management\n" +
//                "3.Facility Management \n" +
//                "4. Booking Management\n" +
//                "5. Promotion Management\n" +
//                "6. Exit\n" +
//                "Your choose : ");
//        int choose = Integer.parseInt(scanner.nextLine());
//        switch (choose) {
//            case 1:
//                do {
//                    System.out.println("1. Display list employees\n" +
//                            "2. Add new employee\n" +
//                            "3. Edit employee\n" +
//                            "4. Return main menu\n" +
//                            "Your choose : ");
//                    int choose1 = Integer.parseInt(scanner.nextLine());
//                    switch (choose1) {
////                    case 1:	displayListEmployees();break;
////                    case 2:	addNewEmployeebreak();break;
////                    case 3:	editEmployee();break;
//                        case 4:
//                            displayMainMenu();
//                            break;
//                    }
//                } while (true);
//
//            case 2:
//                do {
//
//                    System.out.println("1. Display list customers\n" +
//                            "2. Add new customer\n" +
//                            "3. Edit customer\n" +
//                            "4.Return main menu/n" +
//                            "Your choose : ");
//                    int choose2 = Integer.parseInt(scanner.nextLine());
//                    switch (choose2) {
////                    case 1:displayListCustomers();break;
////                    case 2:addNewCustomer()break;
////                    case 3:editCustomer();break;
//                        case 4:
//                            displayMainMenu();
//                            break;
//                    }
//
//                }while (true);
//            case 3:
//                do {
//                System.out.println("1. Display list facility\n" +
//                        "2. Add new facility\n" +
//                        "3.Display list facility maintenance\n" +
//                        "4. Return main menu\n" +
//                        "Your choose : ");
//                int choose3 = Integer.parseInt(scanner.nextLine());
//                switch (choose3) {
////                    case 1:displayListFacility();break;
////                    case 2:addNewFacility();break;
////                    case 3:displayListFacilityMaintenance();break;
//                    case 4:
//                        displayMainMenu();
//                        break;
//                }
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
////                    case 1:addNewBooking();break;
////                    case 2:displayListBooking();break;
////                    case 3:createNewContracts();break;
////                    case 4:displayListContracts();break;
////                    case 5:editContracts();break;
//                    case 6:
//                        displayMainMenu();
//                        break;
//                }
//
//                }while (true);
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
//                        displayMainMenu();
//                        break;
//                }
//            case 6:
//                System.exit(0);
//        }
//    }
//
//    public static void main(String[] args) {
//        displayMainMenu();
//
//    }
//}
