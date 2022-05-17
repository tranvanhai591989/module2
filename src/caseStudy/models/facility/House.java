package caseStudy.models.facility;

public class House extends Facility {
    String houseStandard;
    int numberFloorsHouse;

    public House() {
    }

    public House(String houseStandard, int numberFloorsHouse) {
        this.houseStandard = houseStandard;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public House(String serviceName, double totalArea, double rentalCost, int numberOfPeople, String rentalType, String houseStandard, int numberFloorsHouse) {
        super(serviceName, totalArea, rentalCost, numberOfPeople, rentalType);
        this.houseStandard = houseStandard;
        this.numberFloorsHouse = numberFloorsHouse;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberFloorsHouse() {
        return numberFloorsHouse;
    }

    public void setNumberFloorsHouse(int numberFloorsHouse) {
        this.numberFloorsHouse = numberFloorsHouse;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "houseStandard='" + houseStandard + '\'' +
                ", numberFloorsHouse=" + numberFloorsHouse +
                '}';
    }
}
