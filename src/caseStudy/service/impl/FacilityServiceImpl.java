package caseStudy.service.impl;

import caseStudy.facility.Facility;
import caseStudy.facility.House;
import caseStudy.facility.Room;
import caseStudy.facility.Villa;
import caseStudy.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner scanner = new Scanner(System.in);
    public static int count;
    public static Map<Facility, Integer> facilityService = new LinkedHashMap<>();
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


    public void add() {
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
                System.out.println("--------Add New Villa-------");
                System.out.println("Input Service Name:");
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
                facilityService.put( new Villa(nameService, acreage, rentalCosts, numberOfPeople, getRentalType(), roomStandard, swimmingPoolArea, numberOfFloors),0);
                count++;
                break;
            case 2:
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
                facilityService.put( new House(nameService1, acreage1, rentalCosts1, numberOfPeople1, getRentalType(), roomStandard1, numberOfFloors1),0);
                count++;
                break;
            case 3:
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
                facilityService.put( new Room(nameService2, acreage2, rentalCosts2, numberOfPeople2, getRentalType(), freeService),0);
                count++;
                break;
        }
    }


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> item : facilityService.entrySet()) {
            System.out.println( item.getValue()+" " +item.getKey() );
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
