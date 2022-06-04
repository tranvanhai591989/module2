package de_quan_ly_benh_an.patient;

public abstract class Patient {
    private int numericalOrder;
    private String patientCode;
    private String patientHosCode;

    private String patientName;
    private String inHospital;
    private String outHospital;
    private String reason;

    public abstract String getInfo();

    public Patient() {
    }

    public Patient(int numericalOrder, String patientCode, String patientName,
                   String inHospital, String outHospital, String reason) {
        this.numericalOrder = numericalOrder;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.inHospital = inHospital;
        this.outHospital = outHospital;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getInHospital() {
        return inHospital;
    }

    public void setInHospital(String inHospital) {
        this.inHospital = inHospital;
    }

    public String getOutHospital() {
        return outHospital;
    }

    public void setOutHospital(String outHospital) {
        this.outHospital = outHospital;
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
                ", patientHosCode='" + patientHosCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", inHospital='" + inHospital + '\'' +
                ", outHospital='" + outHospital + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getPatientHosCode() {
        return patientHosCode;
    }

    public void setPatientHosCode(String patientHosCode) {
        this.patientHosCode = patientHosCode;
    }

    public Patient(int numericalOrder, String patientCode, String patientHosCode, String patientName, String inHospital, String outHospital, String reason) {
        this.numericalOrder = numericalOrder;
        this.patientCode = patientCode;
        this.patientHosCode = patientHosCode;
        this.patientName = patientName;
        this.inHospital = inHospital;
        this.outHospital = outHospital;
        this.reason = reason;
    }

}
