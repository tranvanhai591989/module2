package caseStudy.models.facility;

import java.util.Comparator;

public class Villa extends Facility implements Comparator<Villa> {
    String roomStand;
    double poolArea;
    int numberFloors;

    public Villa(){

    }

    public Villa(String roomStand, double poolArea, int numberFloors) {
        this.roomStand = roomStand;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double totalArea, double rentalCost, int numberOfPeople, String rentalType, String roomStand, double poolArea, int numberFloors) {
        super(serviceName, totalArea, rentalCost, numberOfPeople, rentalType);
        this.roomStand = roomStand;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;

    }
    public static String getRentalType() {
        do {
            System.out.println("1. Year rental\n" +
                    "2. Month rental\n" +
                    "3. Day rental\n" +
                    "4. Hours rental\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 4) {
                switch (chanel) {
                    case 1:
                        return "Year rental";
                    case 2:
                        return "Month rental";
                    case 3:
                        return "Day rental";
                    case 4:
                        return "Hours rental";
                }
                break;
            } else {
                System.out.println("Please Retype");
            }

        } while (true);
        return " ";
    }
    public String getRoomStand() {
        return roomStand;
    }

    public void setRoomStand(String roomStand) {
        this.roomStand = roomStand;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStand='" + roomStand + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public int compare(Villa o1, Villa o2) {
        return 0;
    }
}
