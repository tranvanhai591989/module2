package caseStudy.service.impl;

import caseStudy.facility.House;
import caseStudy.facility.Room;
import caseStudy.facility.Villa;
import caseStudy.service.FacilityService;
import caseStudy.ultil.ReadAndWrite;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner scanner = new Scanner(System.in);
    public static int countVilla = 0;
    public static int countHouse = 0;
    public static int countRoom = 0;
    public static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    public static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    public static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    private ReadAndWrite SaveAndDisplayData;


    public static String getRentalType() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Rental Type------\n" +
                    "1. Hours\n" +
                    "2. Day\n" +
                    "3. Month\n" +
                    "4. Year\n" +
                    "Your choose  ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose >= 1 && choose <= 4) {
                switch (choose) {
                    case 1:
                        return "Hours";
                    case 2:
                        return "Day";
                    case 3:
                        return "Month";
                    case 4:
                        return "Year";
                    default:
                        System.out.println("Please Retype In 1->4");
                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }


    public void add() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "Your choose");

        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Retype");
        }
        switch (choose) {
            case 1:
                ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\villa.csv");

                System.out.println("--------Add New Villa-------\n");
                System.out.println("Input Service Name : ");
                String nameService = scanner.nextLine();

                System.out.println("Input Villa Area:");
                double acreage = Double.parseDouble(scanner.nextLine());

                System.out.println("Input Rental Costs(chi phí thuê):");
                double rentalCosts = Double.parseDouble(scanner.nextLine());

                System.out.println("Input numberOfPeople:");
                int numberOfPeople = Integer.parseInt(scanner.nextLine());

                System.out.println("Input roomStandard");
                String roomStandard = scanner.nextLine();

                System.out.println("Input swimmingPoolArea");
                double swimmingPoolArea = Double.parseDouble(scanner.nextLine());

                System.out.println("Input numberOfFloors");
                int numberOfFloors = Integer.parseInt(scanner.nextLine());


                villaIntegerMap.put(new Villa(nameService, acreage, rentalCosts, numberOfPeople, getRentalType(), roomStandard, swimmingPoolArea, numberOfFloors), countVilla);
                String lineVilla = null;
                for (Map.Entry<Villa, Integer> item : villaIntegerMap.entrySet()) {
                    lineVilla = item.getKey().getInfoFa();
                }
                ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\villa.csv", lineVilla);
                countVilla++;
                break;
            case 2:
                ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\house.csv");
                System.out.println("--------Add New House-------");
                System.out.println("Input Service Name:");
                String nameService1 = scanner.nextLine();

                System.out.println("Input House Area(diện tích):");
                double acreage1 = Double.parseDouble(scanner.nextLine());

                System.out.println("Input rentalCosts(chi phí thuê):");
                double rentalCosts1 = Double.parseDouble(scanner.nextLine());

                System.out.println("Input numberOfPeople:");
                int numberOfPeople1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Input roomStandard");
                String roomStandard1 = scanner.nextLine();

                System.out.println("Input numberOfFloors");
                int numberOfFloors1 = Integer.parseInt(scanner.nextLine());

                houseIntegerMap.put(new House(nameService1, acreage1, rentalCosts1, numberOfPeople1, getRentalType(), roomStandard1, numberOfFloors1), countHouse);
                String lineHouse = null;
                for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()) {
                    lineHouse = item.getKey().getInfoFa();
                }
                ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\house.csv", lineHouse);
                countHouse++;
                break;
            case 3:
                ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\room.csv");
                System.out.println("--------Add New Room-------");
                System.out.println("Input Service Name:");
                String nameService2 = scanner.nextLine();

                System.out.println("Input Room Area:");
                double acreage2 = Double.parseDouble(scanner.nextLine());

                System.out.println("Input rentalCosts(chi phí thuê):");
                double rentalCosts2 = Double.parseDouble(scanner.nextLine());

                System.out.println("Input numberOfPeople:");
                int numberOfPeople2 = Integer.parseInt(scanner.nextLine());

                System.out.println("Input freeService(DV miễn phí đi kèm):");
                String freeService = scanner.nextLine();

                roomIntegerMap.put(new Room(nameService2, acreage2, rentalCosts2, numberOfPeople2, getRentalType(), freeService), countRoom);

                String lineRoom = null;
                for (Map.Entry<Room, Integer> item : roomIntegerMap.entrySet()) {
                    lineRoom = item.getKey().getInfoFa();
                }
                ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\room.csv", lineRoom);
                countRoom++;
                break;
        }
    }


    @Override
    public void display() {
//        ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\villa.csv");
        List<String[]> listVilla = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\villa.csv");
        villaIntegerMap.clear();
        for (String[] item : listVilla) {
//            String serviceName, double acreage, double rentalCosts, int numberOfPeople, String rentalType,
//            String roomStandard, double swimmingPoolArea, int numberOfFloors)
            Villa villa = new Villa(item[0],
                    Double.parseDouble(item[1]),
                    Double.parseDouble(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]),
                    Integer.parseInt(item[7]));
            int value =  Integer.parseInt(item[8]);
            villaIntegerMap.put(villa, value);
        }
        for (Map.Entry<Villa, Integer> item : villaIntegerMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
        listVilla.clear();


//        ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\house.csv");
        List<String[]> listHouse = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\house.csv");
        houseIntegerMap.clear();
        for (String[] item : listHouse) {
//            String serviceName, double acreage, double rentalCosts, int numberOfPeople,
//            String rentalType, String roomStandard, int numberOfFloors
            House house = new House(item[0],
                    Double.parseDouble(item[1]),
                    Double.parseDouble(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[7]));
            int value =  Integer.parseInt(item[8]);
            houseIntegerMap.put(house, value);
        }
        for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
        listVilla.clear();

        ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\room.csv");
        roomIntegerMap.clear();
        for (String[] item : listVilla) {
//            String serviceName, double acreage, double rentalCosts, int numberOfPeople,
//            String rentalType, String roomStandard, int numberOfFloors
            House house = new House(item[0],
                    Double.parseDouble(item[1]),
                    Double.parseDouble(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[7]));
            int value =  Integer.parseInt(item[8]);
            houseIntegerMap.put(house, value);
        }
        for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
        listVilla.clear();
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
