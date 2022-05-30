package caseStudy.models.service.impl;

import caseStudy.models.facility.Facility;
import caseStudy.models.facility.House;
import caseStudy.models.facility.Room;
import caseStudy.models.facility.Villa;
import caseStudy.models.person.Customer;
import caseStudy.models.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl extends Facility implements FacilityService {

    public static Map<Facility, Integer> facilityServiceVilla = new LinkedHashMap<>();
    public static Map<Facility, Integer> facilityServiceHouse = new LinkedHashMap<>();
    public static Map<Facility, Integer> facilityServiceRoom = new LinkedHashMap<>();
    public static int keyVilla = 0;
    public static int keyHouse = 0;
    public static int keyRoom = 0;


    public static Scanner scanner = new Scanner(System.in);


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
                        System.out.println("Villa Id");
                        String villaId = scanner.nextLine();
                        System.out.println("Villa area");
                        double totalArea = Double.parseDouble(scanner.nextLine());
                        System.out.println("Rental Cost");
                        double rentalCost = Double.parseDouble(scanner.nextLine());
                        System.out.println("Number People");
                        int numberOfPeople = Integer.parseInt(scanner.nextLine());
                        System.out.println("Room stand");
                        String roomStand = scanner.nextLine();
                        System.out.println("Pool Area");
                        double poolArea = Double.parseDouble(scanner.nextLine());
                        System.out.println("Number floor");
                        int numberFloors = Integer.parseInt(scanner.nextLine());
                        facilityServiceVilla.put(new Villa(serviceName, totalArea, rentalCost, numberOfPeople, getRentalType(), roomStand, villaId,poolArea, numberFloors), keyVilla);
                        keyVilla++;


                        break;
                    case 2:
                        System.out.println("Add New House\n" +
                                "Service Name");
                        String serviceNameHouse = scanner.nextLine();
                        System.out.println("House area");
                        double totalAreaHouse = Double.parseDouble(scanner.nextLine());
                        System.out.println("Rental Cost");
                        double rentalCostHouse = Double.parseDouble(scanner.nextLine());
                        System.out.println("Number People");
                        int numberOfPeopleHouse = Integer.parseInt(scanner.nextLine());
                        System.out.println("Rental Type");
                        String rentalTypeHouse = scanner.nextLine();
                        System.out.println("House stand");
                        String houseStand = scanner.nextLine();
                        System.out.println("Number floors");
                        int numberFloorsHouse = Integer.parseInt(scanner.nextLine());
                        facilityServiceHouse.put(new House(serviceNameHouse, totalAreaHouse, rentalCostHouse, numberOfPeopleHouse, getRentalType(), houseStand, numberFloorsHouse), keyHouse);
                        keyHouse++;

                        break;
                    case 3:
                        System.out.println("Add New Room\n" +
                                "Service Name");
                        String serviceNameRoom = scanner.nextLine();
                        System.out.println("Room area");
                        double totalAreaRoom = Double.parseDouble(scanner.nextLine());
                        System.out.println("Rental Cost");
                        double rentalCostRoom = Double.parseDouble(scanner.nextLine());
                        System.out.println("Number People");
                        int numberOfPeopleRoom = Integer.parseInt(scanner.nextLine());
                        System.out.println("Rental Type");
                        String rentalTypeRoom = scanner.nextLine();
                        System.out.println("Free service");
                        String freeService = scanner.nextLine();
                        facilityServiceRoom.put(new Room(serviceNameRoom, totalAreaRoom, rentalCostRoom, numberOfPeopleRoom, getRentalType(), freeService), keyRoom);
                        keyRoom++;

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
    public Customer display() {
        System.out.println("1. Display Villa\n" +
                "2. Display House\n" +
                "3. Display Room\n" +
                "Your Choose");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                for (Map.Entry<Facility, Integer> element : facilityServiceVilla.entrySet()) {
                    System.out.println("Service name : "+element.getKey()+ "Số lần thuê : "+element.getValue());
                }
                break;
            case 2:
                for (Map.Entry<Facility, Integer> element : facilityServiceHouse.entrySet()) {
                    System.out.println("Service name : "+element.getKey()+ "Số lần thuê : "+element.getValue());
                }
                break;
            case 3:
                for (Map.Entry<Facility, Integer> element : facilityServiceRoom.entrySet()) {
                    System.out.println("Service name : "+element.getKey()+ "Số lần thuê : "+element.getValue());
                }
                break;
            default:

        }


        return null;
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
