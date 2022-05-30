package caseStudy.controller;

import caseStudy.models.facility.Facility;
import caseStudy.models.service.impl.BookingServiceImpl;
import caseStudy.models.service.impl.CustomerServiceImpl;
import caseStudy.models.service.impl.EmployeeServiceImpl;
import caseStudy.models.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        CustomerServiceImpl customerServiceIml = new CustomerServiceImpl();
        FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();
        BookingServiceImpl abc = new BookingServiceImpl();
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
                                facilityServiceImpl.display();
                                break;
                            case 2:
                                facilityServiceImpl.add();
                                break;
                            case 3:

                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }

                    } while (true);
                case 4:
                    abc.chooseFacility();
                case 6:
                    System.exit(0);

            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
