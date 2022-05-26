package caseStudy.models.service.impl;

import caseStudy.models.facility.Facility;
import caseStudy.models.facility.House;
import caseStudy.models.facility.Room;
import caseStudy.models.facility.Villa;
import caseStudy.models.service.FacilityService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl extends Facility implements FacilityService {

    public static Map<Facility, Integer> facilityServiceLinkedHashMap = new LinkedHashMap<>();
    public static int key = 7;


    public static Scanner scanner = new Scanner(System.in);

    static {
        facilityServiceLinkedHashMap.put(new House("house", 150, 3000000, 15, "thue tron goi", "3DK", 2), 1);
        facilityServiceLinkedHashMap.put(new Room("room", 35, 150000, 6, "thue tron goi", "2DK"), 2);
        facilityServiceLinkedHashMap.put(new Villa("villa", 150, 3000000, 15, "thue tron goi", "2DK", 45, 3), 3);
        facilityServiceLinkedHashMap.put(new Villa("villa", 150, 3000000, 11, "thue tron goi", "2DK", 45, 3), 4);
        facilityServiceLinkedHashMap.put(new Villa("villa", 150, 3000000, 12, "thue tron goi", "2DK", 45, 3), 5);
        facilityServiceLinkedHashMap.put(new Villa("villa", 150, 3000000, 22, "thue tron goi", "2DK", 45, 3), 6);
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
                        facilityServiceLinkedHashMap.put(new Villa(serviceName, totalArea, rentalCost, numberOfPeople, getRentalType(), roomStand, poolArea, numberFloors), key);
                        key++;
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
                        facilityServiceLinkedHashMap.put(new House(serviceNameHouse, totalAreaHouse, rentalCostHouse, numberOfPeopleHouse, getRentalType(), houseStand, numberFloorsHouse), key);
                        key++;
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
                        facilityServiceLinkedHashMap.put(new Room(serviceNameRoom, totalAreaRoom, rentalCostRoom, numberOfPeopleRoom, getRentalType(), freeService), key);
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
        ArrayList<Facility> arrayListHouse = new ArrayList<>();
        ArrayList<Facility> arrayListRoom = new ArrayList<>();
        ArrayList<Facility> arrayListVilla= new ArrayList<>();
        for (Map.Entry<Facility , Integer> element :facilityServiceLinkedHashMap.entrySet()){
            if (element.getKey().getServiceName()=="house"){
                arrayListHouse.add(element.getKey());
            }else if (element.getKey().getServiceName()=="room"){
                arrayListRoom.add(element.getKey());
            }else {
                arrayListVilla.add(element.getKey());
            }
            System.out.println( element.getKey() +" " + element.getValue());
            System.out.println("So lan villa duoc booking"+arrayListVilla.size());
            System.out.println("So lan House duoc booking"+arrayListHouse.size());
            System.out.println("So lan Room duoc booking"+arrayListRoom.size());
        }
        if (arrayListVilla.size()>4){
            System.out.println("Villa dang duoc bao tri");
            arrayListVilla.clear();
        }
        if (arrayListRoom.size()>4){
            System.out.println("Room dang duoc bao tri");
            arrayListRoom.clear();
        }
        if (arrayListHouse.size()>4){
            System.out.println("House dang duoc bao tri");
            arrayListHouse.clear();
        }

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
