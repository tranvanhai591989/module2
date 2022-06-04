package de_quan_ly_benh_an.patient;

public class PatientNormal extends Patient {
    private double payment;

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOrder(),
                super.getPatientCode(),
                super.getPatientHosCode(),
                super.getPatientName(),
                super.getInHospital(),
                super.getOutHospital(),
                super.getReason(),
                getPayment());
    }

    public PatientNormal(double payment) {
        this.payment = payment;
    }

    public PatientNormal(int numericalOrder, String patientCode, String patientName, String inHospital, String outHospital, String reason, double payment) {
        super(numericalOrder, patientCode, patientName, inHospital, outHospital, reason);
        this.payment = payment;
    }

    public PatientNormal(int numericalOrder, String patientCode, String patientHosCode, String patientName, String inHospital, String outHospital, String reason, double payment) {
        super(numericalOrder, patientCode, patientHosCode, patientName, inHospital, outHospital, reason);
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PatientNormal{" +
                "payment=" + payment +
                '}';
    }
}
