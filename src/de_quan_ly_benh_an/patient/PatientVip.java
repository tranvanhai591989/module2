package de_quan_ly_benh_an.patient;

import java.util.Scanner;

public class PatientVip extends Patient {
    public String patientType;   // loại
    public String patientEffect;   // Hiệu lực

    public PatientVip() {
    }

    public PatientVip(String patientType, String patientEffect, Scanner scanner) {
        this.patientType = patientType;
        this.patientEffect = patientEffect;
        this.scanner = scanner;
    }

    public PatientVip(int numericalOrder, String patientCode, String patientName, String inHospital, String outHospital, String reason, String patientType, String patientEffect, Scanner scanner) {
        super(numericalOrder, patientCode, patientName, inHospital, outHospital, reason);
        this.patientType = patientType;
        this.patientEffect = patientEffect;
        this.scanner = scanner;
    }

    public PatientVip(int numericalOrder, String patientCode, String patientHosCode, String patientName, String inHospital, String outHospital, String reason, String patientType, String patientEffect, Scanner scanner) {
        super(numericalOrder, patientCode, patientHosCode, patientName, inHospital, outHospital, reason);
        this.patientType = patientType;
        this.patientEffect = patientEffect;
        this.scanner = scanner;
    }

    Scanner scanner = new Scanner(System.in);
    public String getPatientType() {
        do {
            try {
                System.out.println("-----loai Vip------\n" +
                        "1. Vip 1\n" +
                        "2. Vip 2\n" +
                        "3. Vip 3\n" +
                        "Your choose  ");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose >= 1 && choose <= 3) {
                    switch (choose) {
                        case 1:
                            return "Vip 1";
                        case 2:
                            return "Vip 2";
                        case 3:
                            return "Vip 3";
                        default:
                            System.out.println("Vui lòng nhập lại trong khoảng từ 1->3");
                    }
                    break;
                } else {
                    System.out.println("Please Retype");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (true);
        return " ";
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientEffect() {
        return patientEffect;
    }

    public void setPatientEffect(String patientEffect) {
        this.patientEffect = patientEffect;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOrder(),
                super.getPatientCode(),
                super.getPatientHosCode(),
                super.getPatientName(),
                super.getInHospital(),
                super.getOutHospital(),
                super.getReason(),
                getPatientType(),
                getPatientEffect());

    }

    @Override
    public String toString() {
        return "PatientVip{" +super.toString()+
                "patientType='" + patientType + '\'' +
                ", patientEffect='" + patientEffect + '\'' +
                '}';
    }
}
