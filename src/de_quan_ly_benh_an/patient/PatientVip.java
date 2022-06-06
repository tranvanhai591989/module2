package de_quan_ly_benh_an.patient;

import java.util.Scanner;

public class PatientVip extends Patient {
    public String patientType;   // loại
    public String patientEffect;   // Hiệu lực
    public static Scanner scanner = new Scanner(System.in);

    public PatientVip() {
    }

    public PatientVip(String patientType, String patientEffect) {
        this.patientType = patientType;
        this.patientEffect = patientEffect;
    }

    public PatientVip(int numericalOrder, String patientCode, String medicalRecordCode, String patientName, String hospitalizedDay, String hospitalDischargeDate, String reason, String patientType, String patientEffect) {
        super(numericalOrder, patientCode, medicalRecordCode, patientName, hospitalizedDay, hospitalDischargeDate, reason);
        this.patientType = patientType;
        this.patientEffect = patientEffect;
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
                            return "VIP I";
                        case 2:
                            return "VIP II";
                        case 3:
                            return "VIP III";
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

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOrder(),
                super.getPatientCode(),
                super.getMedicalRecordCode(),
                super.getPatientName(),
                super.getHospitalizedDay(),
                super.getHospitalDischargeDate(),
                super.getReason(),
                getPatientType(),
                getPatientEffect());

    }

    @Override
    public String toString() {
        return "PatientVip{" + super.toString() +
                "patientType='" + patientType + '\'' +
                ", patientEffect='" + patientEffect + '\'' +
                '}';
    }
}
