package de_quan_ly_benh_an.service;

import caseStudy.Exception.NameException;

import de_quan_ly_benh_an.patient.PatientNormal;
import de_quan_ly_benh_an.patientException.InHosException;
import de_quan_ly_benh_an.patientException.PaymentException;
import de_quan_ly_benh_an.ultil.FormatString;
import de_quan_ly_benh_an.ultil.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientNormalImpl extends PatientNormal implements PatientImpl {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String[]> patientNormal = new ArrayList<>();
    public static ArrayList<PatientNormal> patientNormalList = new ArrayList<>();
    public static int patientID;

    @Override
    public String add() throws IOException {
        patientNormalList.clear();
        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");

        for (String[] item : patientNormal) {
            if (item.length == 7) {
                PatientNormal patientNormal = new PatientNormal(
                        Integer.parseInt(item[0]),
                        item[1],
                        item[2],
                        item[3],
                        item[4],
                        item[5],
                        Double.parseDouble(item[6]));
                patientNormalList.add(patientNormal);
            }
        }
        int max = 0;
        if (patientNormalList.isEmpty()) {
            patientID = 1;
        } else {
            patientID=patientNormalList.size()+1;
        }
        String patientNormalCode = "BN-" + (patientID + 1000);


        String nameNormal;
        do {
            try {
                System.out.println("Input the Name Patient (Ex : Tran Van Hai)");
                nameNormal = scanner.nextLine();
                if (FormatString.formatName(nameNormal)) {
                    break;
                } else {
                    throw new NameException("Wrong Format Input");
                }
            } catch (NameException e) {
                e.printStackTrace();
            }

        } while (true);


        String inHospital;
        do {
            System.out.println("The day in Hospital (Ex: dd/MM/yyyy");
            inHospital = scanner.nextLine();
            if (FormatString.dateFormat(inHospital)) {
                break;
            } else {
                try {
                    throw new InHosException("Wrong Format Input");
                } catch (InHosException e) {
                    e.printStackTrace();
                }
            }
        } while (true);


        String outHospital;
        do {
            System.out.println("The day out Hospital (Ex: dd/MM/yyyy");
            outHospital = scanner.nextLine();
            if (FormatString.dateFormat(outHospital)) {
                break;
            } else {
                try {
                    throw new InHosException("Wrong Format Input");
                } catch (InHosException e) {
                    e.printStackTrace();
                }
            }
        } while (true);


        double payment;
        do {
            System.out.println("Pay the Moment");
            payment = scanner.nextDouble();
            if (payment > 0) {
                break;
            } else {
                try {
                    throw new PaymentException("Wrong Format Input");
                } catch (PaymentException e) {
                    e.printStackTrace();
                }

            }
        } while (true);
        System.out.println();


        System.out.println("The reason");
        System.out.println();
        String reason = scanner.nextLine();


        PatientNormal patientNormal = new PatientNormal(patientID, patientNormalCode,
                nameNormal, inHospital, outHospital, reason, payment);
        patientNormalList.add(patientNormal);
        String line = patientNormal.getInfo();
        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv", line);
        System.out.println(" Add successful");

        return patientNormalCode;
    }

    @Override
    public void delete() throws IOException {
        patientNormalList.clear();
        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
        for (String[] item : patientNormal) {
            PatientNormal patientNormal = new PatientNormal(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]));
            patientNormalList.add(patientNormal);
        }
        System.out.println("Input patient code you want delete (EX: 1234)");
        int idDelete = Integer.parseInt(scanner.nextLine());
        String codeDelete = "BN-" + idDelete;
        boolean flag = false;
        for (int i = 0; i < patientNormalList.size(); i++) {
            if (patientNormalList.get(i).getPatientCode().equals(codeDelete)) {
                patientNormalList.remove(i);
                System.out.println("Delete successful ");
                flag = true;
            } else {
                flag = true;
            }

        }
        if (flag) {
            System.out.println(" ID not Exist");
        }
        ReadAndWrite.clearFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
        for (PatientNormal item : patientNormalList) {
            String line = item.getInfo();
            ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");

        }
    }

    @Override
    public void display() {
        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
        patientNormalList.clear();
        for (String[] item : patientNormal) {
            if (item.length == 7) {
                PatientNormal patientNormal = new PatientNormal(Integer.parseInt(item[0]), item[1],
                        item[2], item[3], item[4], item[5], Double.parseDouble(item[6]));
                patientNormalList.add(patientNormal);
            }
        }
        System.out.println("Patient normal List");
        for (PatientNormal item : patientNormalList) {
            System.out.println(item);

        }
    }

}

