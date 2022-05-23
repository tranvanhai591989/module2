package caseStudy.models.facility;

import java.util.Comparator;

public class Room extends Facility implements Comparator<Room> {
    String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double totalArea, double rentalCost, int numberOfPeople, String rentalType, String freeService) {
        super(serviceName, totalArea, rentalCost, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public int compare(Room o1, Room o2) {
        return 0;
    }
}
