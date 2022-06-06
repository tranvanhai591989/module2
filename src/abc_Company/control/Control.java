package abc_Company.control;

import abc_Company.employImpl.ManagerImpl;
import abc_Company.employImpl.ProductStaffImpl;
import abc_Company.employee.ProductionStaff;

import java.io.IOException;
import java.util.Scanner;

public class Control {
    public static Scanner scanner = new Scanner(System.in);


    public static void displayMainMenu() {
        ManagerImpl managerImpl = new ManagerImpl();
        ProductStaffImpl productStaffImpl = new ProductStaffImpl();

        do {
            try {
                System.out.println("----Employee manager----\n" +
                        "1. Display employ\n" +
                        "2. Add employ\n" +
                        "3. Edit employ\n" +
                        "4. Delete employ\n" +
                        "5. Return main menu\n");
                int chanel = 0;
                try {
                    chanel = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please Retype");
                }
                switch (chanel) {
                    case 1:
                        managerImpl.display();
                        productStaffImpl.display();

                        break;
                    case 2:
                        do {
                            System.out.println("Add chanel\n" +
                                    "1. Add production staff\n" +
                                    "2. Add manager\n" +
                                    "3. Return main menu");
                            chanel = 0;
                            try {
                                chanel = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.out.println("Please Retype");
                            }
                            switch (chanel) {
                                case 1:
                                    productStaffImpl.add();
                                    break;
                                case 2:
                                    managerImpl.add();
                                    break;
                                case 3:
                                    displayMainMenu();
                                    break;


                            }
                        } while (true);
                    case 3:
                        do {
                            System.out.println("Edit chanel\n" +
                                    "1. Edit production staff\n" +
                                    "2. Edit manager\n" +
                                    "3. Return main menu");
                            chanel = 0;
                            try {
                                chanel = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.out.println("Please Retype");
                            }
                            switch (chanel) {
                                case 1:
                                    productStaffImpl.edit();
                                    break;
                                case 2:
                                    managerImpl.edit();

                                    break;
                                case 3:
                                    displayMainMenu();
                                    break;

                            }
                        } while (true);
                    case 4:
                        do {
                            System.out.println("Delete chanel\n" +
                                    "1. Delete production staff\n" +
                                    "2. Delete manager\n" +
                                    "3. Return main menu");
                            chanel = 0;
                            try {
                                chanel = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.out.println("Please Retype");
                            }
                            switch (chanel) {
                                case 1:
                                    productStaffImpl.delete();
                                    break;
                                case 2:
                                    managerImpl.delete();
                                    break;
                                case 3:
                                   displayMainMenu();
                                   break;

                            }
                        } while (true);
                    case 5:
                        System.exit(0);
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Please Retype");
            }
        } while (true);
    }
}


