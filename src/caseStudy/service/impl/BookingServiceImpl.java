package caseStudy.service.impl;

import caseStudy.facility.Booking;
import caseStudy.facility.Facility;
import caseStudy.person.Customer;
import caseStudy.service.BookingComparator;
import caseStudy.service.ServiceBooking;

import java.util.*;

public class BookingServiceImpl implements ServiceBooking {
    public static Scanner scanner = new Scanner(System.in);
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static List<Customer> customerList = new ArrayList<>();

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start rental day : ");
        String startDate = scanner.nextLine();
        System.out.println("Input start rental day : ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Booking successful");
    }

    @Override
    public void displayBooking() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }

    public static Customer chooseCustomer() {
        System.out.println("Customer List : ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Input Customer ID : ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Incorrect!!! Please Retype ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Service List");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Service Code");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getServiceName())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Incorrect!!! Please Retype");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
