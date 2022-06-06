package de_quan_ly_benh_an.patient;

public abstract class Patient {
    private int numericalOrder;
    private String patientCode;          // mã bệnh nhân
    private String medicalRecordCode;    // mã bệnh án
    private String patientName;
    private String hospitalizedDay;      // ngày nhập viện
    private String hospitalDischargeDate;// ngày xuất viện
    private String reason;

    public abstract String getInfo();

    public Patient() {
    }

    public Patient(int numericalOrder, String patientCode, String medicalRecordCode, String patientName, String hospitalizedDay, String hospitalDischargeDate, String reason) {
        this.numericalOrder = numericalOrder;
        this.patientCode = patientCode;
        this.medicalRecordCode = medicalRecordCode;
        this.patientName = patientName;
        this.hospitalizedDay = hospitalizedDay;
        this.hospitalDischargeDate = hospitalDischargeDate;
        this.reason = reason;
    }

    public int getNumericalOrder() {
        return numericalOrder;
    }

    public void setNumericalOrder(int numericalOrder) {
        this.numericalOrder = numericalOrder;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(String hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    public String getHospitalDischargeDate() {
        return hospitalDischargeDate;
    }

    public void setHospitalDischargeDate(String hospitalDischargeDate) {
        this.hospitalDischargeDate = hospitalDischargeDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "numericalOrder=" + numericalOrder +
                ", patientCode='" + patientCode + '\'' +
                ", medicalRecordCode='" + medicalRecordCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", hospitalizedDay='" + hospitalizedDay + '\'' +
                ", hospitalDischargeDate='" + hospitalDischargeDate + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
