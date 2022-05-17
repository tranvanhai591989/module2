package caseStudy.models.facility;

public class Villa extends Facility {
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
}
