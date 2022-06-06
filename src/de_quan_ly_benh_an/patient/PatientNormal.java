package de_quan_ly_benh_an.patient;

public class PatientNormal extends Patient {
    private double payment;

    public PatientNormal() {
    }

    public PatientNormal(double payment) {
        this.payment = payment;
    }

    public PatientNormal(int numericalOrder, String patientCode, String medicalRecordCode, String patientName, String hospitalizedDay, String hospitalDischargeDate, String reason, double payment) {
        super(numericalOrder, patientCode, medicalRecordCode, patientName, hospitalizedDay, hospitalDischargeDate, reason);
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOrder(),
                super.getPatientCode(),
                super.getMedicalRecordCode(),
                super.getPatientName(),
                super.getHospitalizedDay(),
                super.getHospitalDischargeDate(),
                super.getReason(),
                getPayment());
    }

    @Override
    public String toString() {
        return "PatientNormal{" +super.toString()+
                "payment=" + payment +
                '}';
    }
}
