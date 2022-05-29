package caseStudy.models.person;

public class Booking {
    private int bookingCode;
    private String startDay;
    private String stopDay;
    private  int customerCode;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(int bookingCode, String startDay, String stopDay, int customerCode, String serviceName, String typeOfService) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.stopDay = stopDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStopDay() {
        return stopDay;
    }

    public void setStopDay(String stopDay) {
        this.stopDay = stopDay;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDay='" + startDay + '\'' +
                ", stopDay='" + stopDay + '\'' +
                ", customerCode=" + customerCode +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
