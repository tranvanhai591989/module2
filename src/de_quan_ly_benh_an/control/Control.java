package de_quan_ly_benh_an.control;

import de_quan_ly_benh_an.patient.PatientNormal;
import de_quan_ly_benh_an.patient.PatientVip;
import de_quan_ly_benh_an.service.PatientNormalImpl;
import de_quan_ly_benh_an.service.PatientVipImpl;

import java.io.IOException;
import java.util.Scanner;

public class Control {
    public static Scanner scanner = new Scanner(System.in);


    public static void displayMenu() throws IOException {
        PatientNormalImpl patientNormal = new PatientNormalImpl();
        PatientVipImpl patientVip = new PatientVipImpl();
        do {
            System.out.println("-----HospitalCenterPrograming-----\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1. Add Patient\n" +
                    "2. Delete patient\n" +
                    "3. Display PatientList\n" +
                    "Your choose");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai!!!!");
            }

            switch (choose) {
                case 1:
                    System.out.println("-----HospitalCenterPrograming-----\n" +
                            "1. Add normal patient\n" +
                            "2.  Add VIP patient\n" +
                            "3. Return main menu\n" +
                            "Your choose");
                    int choose1 = 0;
                    try {
                        choose1 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhap lai!!!!");
                    }

                    switch (choose1) {
                        case 1:
                            patientNormal.add();
                            displayMenu();
                            break;
                        case 2:
                            patientVip.add();
                            displayMenu();
                            break;
                        case 3:
                            return;
                        default:
                    }
                    while (true) ;


                case 2:
                    System.out.println("-----HospitalCenterPrograming-----\n" +
                            "1. Delete normal patient\n" +
                            "2. Delete Vip patient\n" +
                            "3. Return Main menu\n" +
                            "Your choose");
                    int choose2 = 0;
                    try {
                        choose2 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhap lai!!!!");
                    }
                    switch (choose2) {
                        case 1:
                            patientNormal.delete();
                            displayMenu();
                            break;
                        case 2:
                            patientVip.delete();
                            displayMenu();
                            break;
                        case 3:
                            return;
                        default:
                    }
                    while (true) ;
                case 3:
                    System.out.println("-----HospitalCenterPrograming-----\n" +
                            "1. Display benh an\n" +
                            "2. Return Main menu" +
                            "Your choose");
                    int choose3 = 0;
                    try {
                        choose3 = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nhap lai!!!!");
                    }
                    switch (choose3) {
                        case 1:
                            patientNormal.display();
                            patientVip.display();
                            displayMenu();
                            break;
                        case 2:
                            displayMenu();
                            break;
                        default:
                    } while (true);


            }

        } while (true);

    }

    public static void patientNormalDisplay() {
        System.out.println();
    }
}
