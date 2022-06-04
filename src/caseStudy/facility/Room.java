package caseStudy.facility;

public class Room extends Facility {
    String freeService;

    public Room() {
    }

    @Override
    public String getInfoFa() {
        return String.format("%s,%s,%s,%s,%s,%s",
                super.getServiceName(),
                super.getAcreage(),
                super.getRentalCosts(),
                super.getNumberOfPeople(),
                super.getRentalType(),
                getFreeService());
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double acreage, double rentalCosts, int numberOfPeople, String rentalType, String freeService) {
        super(serviceName, acreage, rentalCosts, numberOfPeople, rentalType);
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
        return "Room[" + super.toString()+
                ", freeService='" + freeService +
                ']';
    }
}
