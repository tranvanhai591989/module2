package de_quan_ly_benh_an.service;

import caseStudy.Exception.NameException;
import de_quan_ly_benh_an.patient.PatientNormal;
import de_quan_ly_benh_an.patient.PatientVip;
import de_quan_ly_benh_an.patientException.InHosException;
import de_quan_ly_benh_an.ultil.FormatString;
import de_quan_ly_benh_an.ultil.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientVipImpl extends PatientVip implements PatientImpl {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String[]> patientVip = new ArrayList<>();
    public static ArrayList<PatientVip> patientVipList = new ArrayList<PatientVip>();
    public static int patientID;


    @Override
    public String add() throws IOException {
        patientVipList.clear();
        patientVip = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");

        for (String[] item : patientVip) {
            if (item.length == 8) {
                PatientVip patientVip = new PatientVip(
                        Integer.parseInt(item[0]),
                        item[1],
                        item[2],
                        item[3],
                        item[4],
                        item[5],
                        item[6],
                        item[7]),
                        item[8],
                        item[9]);
                patientVipList.add(patientVip);
            }
        }

        if (patientVipList.isEmpty()) {
            patientID = 1;
        } else {
            patientID = patientVipList.size() + 1;
        }
        String patientVipCode = "BN-" + (patientID + 2000);
        String patientVipHosCode = "BN-" + (patientID + 2000);
        String vipName;
        do {
            try {
                System.out.println("Input the Name Patient (Ex : Tran Van Hai)");
                vipName = scanner.nextLine();
                if (FormatString.formatName(vipName)) {
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


        System.out.println("The reason");
        String reason = scanner.nextLine();


        String type = "VIP";


        PatientVip patientVip = new PatientVip(patientID, patientVipCode,patientVipHosCode,
                vipName, inHospital, outHospital, reason, type, getPatientType());
        patientVipList.add(patientVip);
        String line = patientVip.getInfo();
        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv", line);
        System.out.println(" Add successful");
        return patientVipCode;
    }

    @Override
    public void delete() throws IOException {
        patientVipList.clear();
        patientVip = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
        for (String[] item : patientVip) {
            PatientNormal patientNormal = new PatientNormal(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]));
            patientVipList.add((PatientVip) patientVip);
        }
        System.out.println("Input patient code you want delete (EX: 1234)");
        int idDelete = Integer.parseInt(scanner.nextLine());
        String codeDelete = "BN-" + idDelete;
        boolean flag = false;
        for (int i = 0; i < patientVipList.size(); i++) {
            if (patientVipList.get(i).getPatientCode().equals(codeDelete)) {
                patientVipList.remove(i);
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
        for (PatientVip item : patientVipList) {
            String line = item.getInfo();
            ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");

        }

    }

    @Override
    public void display() {
        patientVipList.clear();
        patientVip = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
        for (String[] item : patientVip) {
            if (item.length == 8) {
                PatientVip patientVip = new PatientVip(Integer.parseInt(item[0]), item[1], item[2],
                        item[3], item[4], item[5], item[6], item[7]);
                patientVipList.add(patientVip);
            }
        }
        System.out.println("Patient Vip3 List");
        for (PatientVip item : patientVipList) {
            System.out.println(item);


        }
    }
}

