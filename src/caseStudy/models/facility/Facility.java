package caseStudy.models.facility;

import java.util.Scanner;

public abstract class Facility {
    String serviceName;
    double totalArea;
    double rentalCost;
    int numberOfPeople;
    String rentalType;

    public Facility() {
    }

    public static Scanner scanner = new Scanner(System.in);

    public Facility(String serviceName, double totalArea, double rentalCost, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.totalArea = totalArea;
        this.rentalCost = rentalCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }



    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public static String getRentalType() {
        return getRentalType();
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", totalArea=" + totalArea +
                ", rentalCost=" + rentalCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

}
