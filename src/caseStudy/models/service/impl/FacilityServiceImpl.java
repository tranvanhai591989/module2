package caseStudy.models.service.impl;

import caseStudy.models.facility.Facility;
import caseStudy.models.facility.House;
import caseStudy.models.facility.Room;
import caseStudy.models.facility.Villa;
import caseStudy.models.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl extends Facility implements FacilityService {

    public static LinkedHashMap<Integer, Facility> facilityServiceLinkedHashMap = new LinkedHashMap<>();
    public static int key = 4;


    public static Scanner scanner = new Scanner(System.in);

    static {
        facilityServiceLinkedHashMap.put(1, new House("house", 150, 3000000, 15, "thue tron goi", "3DK", 2));
        facilityServiceLinkedHashMap.put(2, new Room("room", 35, 150000, 6, "thue tron goi", "2DK"));
        facilityServiceLinkedHashMap.put(3, new Villa("villa", 150, 3000000, 15, "thue tron goi", "2DK", 45, 3));
    }

    @Override
    public void add() {

        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 4) {
                switch (chanel) {
                    case 1:
                        System.out.println("Add New Villa\n" +
                                "Service Name");
                        String serviceName = scanner.nextLine();
                        System.out.println("Villa area");
                        double totalArea = scanner.nextDouble();
                        System.out.println("Rental Cost");
                        double rentalCost = scanner.nextDouble();
                        System.out.println("Number People");
                        int numberOfPeople = Integer.parseInt(scanner.nextLine());

                        System.out.println("Room stand");
                        String roomStand = scanner.nextLine();
                        System.out.println("Pool Area");
                        double poolArea = scanner.nextDouble();
                        System.out.println("Pool Area");
                        int numberFloors = Integer.parseInt(scanner.nextLine());
                        facilityServiceLinkedHashMap.put(key, new Villa(serviceName, totalArea, rentalCost, numberOfPeople, getRentalType(), roomStand, poolArea, numberFloors));
                        key++;
                        break;
                    case 2:
                        System.out.println("Add New House\n" +
                                "Service Name");
                        String serviceNameHouse = scanner.nextLine();
                        System.out.println("House area");
                        double totalAreaHouse = scanner.nextDouble();
                        System.out.println("Rental Cost");
                        double rentalCostHouse = scanner.nextDouble();
                        System.out.println("Number People");
                        int numberOfPeopleHouse = Integer.parseInt(scanner.nextLine());
                        System.out.println("Rental Type");
                        String rentalTypeHouse = scanner.nextLine();
                        System.out.println("House stand");
                        String houseStand = scanner.nextLine();
                        System.out.println("Number floors");
                        int numberFloorsHouse = Integer.parseInt(scanner.nextLine());
                        facilityServiceLinkedHashMap.put(key, new House(serviceNameHouse, totalAreaHouse, rentalCostHouse, numberOfPeopleHouse, getRentalType(), houseStand, numberFloorsHouse));
                        key++;
                        break;
                    case 3:
                        System.out.println("Add New Room\n" +
                                "Service Name");
                        String serviceNameRoom = scanner.nextLine();
                        System.out.println("Room area");
                        double totalAreaRoom = scanner.nextDouble();
                        System.out.println("Rental Cost");
                        double rentalCostRoom = scanner.nextDouble();
                        System.out.println("Number People");
                        int numberOfPeopleRoom = Integer.parseInt(scanner.nextLine());
                        System.out.println("Rental Type");
                        String rentalTypeRoom = scanner.nextLine();
                        System.out.println("Free service");
                        String freeService = scanner.nextLine();
                        facilityServiceLinkedHashMap.put(key, new Room(serviceNameRoom, totalAreaRoom, rentalCostRoom, numberOfPeopleRoom, getRentalType(), freeService));
                        break;
                    case 4:
                        break;
                }
                break;
            } else {
                System.out.println("Please Retype");
            }

        } while (true);
    }


    @Override
    public void display() {
            System.out.println(facilityServiceLinkedHashMap);
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
