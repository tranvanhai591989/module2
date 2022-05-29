package caseStudy.models.facility;
import java.util.Comparator;

public class Villa extends Facility implements Comparator<Villa> {
    private String id;
    private String roomStand;
    private double poolArea;
    private  int numberFloors;

    public Villa() {
    }

    public Villa(String id, String roomStand, double poolArea, int numberFloors) {
        this.id = id;
        this.roomStand = roomStand;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double totalArea, double rentalCost, int numberOfPeople, String rentalType, String id, String roomStand, double poolArea, int numberFloors) {
        super(serviceName, totalArea, rentalCost, numberOfPeople, rentalType);
        this.id = id;
        this.roomStand = roomStand;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Villa{" +
                "id='" + id + '\'' +
                ", roomStand='" + roomStand + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                ", serviceName='" + serviceName + '\'' +
                ", totalArea=" + totalArea +
                ", rentalCost=" + rentalCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public int compare(Villa o1, Villa o2) {
        return 0;
    }
}
