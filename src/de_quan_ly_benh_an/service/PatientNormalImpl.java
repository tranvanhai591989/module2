//package de_quan_ly_benh_an.service;
//
//import caseStudy.Exception.NameException;
//import de_quan_ly_benh_an.patient.Patient;
//import de_quan_ly_benh_an.patient.PatientNormal;
//import de_quan_ly_benh_an.patientException.InHosException;
//import de_quan_ly_benh_an.patientException.PaymentException;
//import de_quan_ly_benh_an.ultil.FormatString;
//import de_quan_ly_benh_an.ultil.ReadAndWrite;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class PatientImpl extends PatientImpl {
//    public static Scanner scanner = new Scanner(System.in);
//    public static List<String[]> patientNormal = new ArrayList<>();
//    public static ArrayList<Patient> patientNormalList = new ArrayList<>();
//    public static int numericalOrder;
//
//    @Override
//    public String add() throws IOException {
//        patientNormalList.clear();
//        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
//
//        for (String[] item : patientNormal) {
//            if (patientNormal.size() == 8) {
//                PatientNormal patientNormal = new PatientNormal(
//                        Integer.parseInt(item[0]),
//                        item[1],
//                        item[2],
//                        item[3],
//                        item[4],
//                        item[5],
//                        item[6],
//                        Double.parseDouble(item[7]));
//                patientNormalList.add(patientNormal);
//            }
//        }
//
//        if (patientNormalList.isEmpty()) {
//            numericalOrder = 1;
//        } else {
//            numericalOrder = patientNormalList.size() + 1;
//        }
//        String patientNormalCode = "BN-" + (numericalOrder + 1000);
//        String medicalRecordCode = "BA-" + (numericalOrder + 1000);
//
//
//        String nameNormal = "";
//        do {
//            try {
//                System.out.println("Input the Name Patient (Ex : Tran Van Hai)");
//                nameNormal = scanner.nextLine();
//                if (FormatString.formatName(nameNormal)) {
//                    break;
//                } else {
//                    throw new NameException("Wrong Format Input");
//                }
//            } catch (NameException e) {
//                e.printStackTrace();
//            }
//
//        } while (true);
//
//
//        String hospitalizedDate = ""; // ngày nhập viện
//        do {
//            System.out.println("Hospitalized Date (Ex: dd/MM/yyyy");
//            hospitalizedDate = scanner.nextLine();
//            if (FormatString.dateFormat(hospitalizedDate)) {
//                break;
//            } else {
//                try {
//                    throw new InHosException("Wrong Format Input");
//                } catch (InHosException e) {
//                    e.printStackTrace();
//                }
//            }
//        } while (true);
//
//
//        String hospitalDischargeDate = "";  // ngày xuất viện
//        do {
//            System.out.println("Hospital discharge date  (Ex: dd/MM/yyyy");
//            hospitalDischargeDate = scanner.nextLine();
//
//            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//            df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
//
//            if (FormatString.dateFormat(hospitalDischargeDate)) {
//                break;
//            } else {
//                try {
//                    df.parse(hospitalDischargeDate); // parse dateString thành kiểu Date
//                } catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
//                    System.out.println("Invalid date");
//                }
//            }
//        } while (true);
//
//
//        double payment;
//        do {
//            System.out.println("Pay the Moment");
//            payment = scanner.nextDouble();
//            if (payment > 0) {
//                break;
//            } else {
//                try {
//                    throw new PaymentException("Wrong Format Input");
//                } catch (PaymentException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        } while (true);
//
//        System.out.println("The reason");
//        String reason1 = scanner.nextLine();
//        String reason = scanner.nextLine();
//
//
//        PatientNormal patientNormal = new PatientNormal(numericalOrder, patientNormalCode, medicalRecordCode,
//                nameNormal, hospitalizedDate, hospitalDischargeDate, reason, payment);
//
//        patientNormalList.add(patientNormal);
//        String line = patientNormal.getInfo();
//
//        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv", line);
//        System.out.println(" Add successful");
//
//        return patientNormalCode;
//    }
//
//    @Override
//    public void delete() throws IOException {
//        patientNormalList.clear();
//        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
//        for (String[] item : patientNormal) {
//            if (item.length == 8) {
//                PatientNormal patientNormal = new PatientNormal(
//                        Integer.parseInt(item[0]),
//                        item[1],
//                        item[2],
//                        item[3],
//                        item[4],
//                        item[5],
//                        item[6],
//                        Double.parseDouble(item[7]));
//                patientNormalList.add(patientNormal);
//            }
//
//        }
//        System.out.println("Input patient code you want delete (EX: 1234)");
//        int idDelete = Integer.parseInt(scanner.nextLine());
//        String codeDelete = "BN-" + idDelete;
//        boolean flag = false;
//        for (int i = 0; i < patientNormalList.size(); i++) {
//            if (patientNormalList.get(i).getPatientCode().equals(codeDelete)) {
//                System.out.println("Y : Delete\n" +
//                        "N : Cancel");
//                String choose = scanner.nextLine();
//                if (choose.equals("Y") | choose.equals("y")) {
//                    patientNormalList.remove(i);
//                    System.out.println("Delete successful ");
//                } else if (choose.equals("N") | choose.equals("n")) {
//                    continue;
//                }
//                flag = true;
//            } else {
//                flag = true;
//            }
//
//        }
//        if (flag) {
//            System.out.println(" ID not Exist");
//        }
//        ReadAndWrite.clearFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
//        for (Patient item : patientNormalList) {
//            String line = item.getInfo();
//            ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
//
//        }
//    }
//
//    @Override
//    public void display() {
//        patientNormal = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\de_quan_ly_benh_an\\data\\patientNomal.csv");
//        patientNormalList.clear();
//        for (String[] item : patientNormal) {
//            if (item.length == 8) {
//                PatientNormal patientNormal = new PatientNormal
//                        (Integer.parseInt(item[0]),
//                                item[1],
//                                item[2],
//                                item[3],
//                                item[4],
//                                item[5],
//                                item[6],
//                                Double.parseDouble(item[7]));
//                patientNormalList.add(patientNormal);
//            }
//        }
//        System.out.println("Patient normal List");
//        for (Patient item : patientNormalList) {
//            System.out.println(item);
//
//        }
//    }
//
//}
//
