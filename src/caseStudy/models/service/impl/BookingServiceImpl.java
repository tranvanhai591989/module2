package caseStudy.models.service.impl;

import caseStudy.models.facility.Facility;
import caseStudy.models.facility.Villa;
import caseStudy.models.person.Booking;
import caseStudy.models.person.Customer;
import caseStudy.models.service.BookingService;
import caseStudy.ultil.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new ArrayList<>();
    static Map<Integer, Villa> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer("Hai", "nam", "hai@gmail.com", "03/05/04", 1, 4561315, 151511515, Customer.getTypeCustomer()));
        customerList.add(new Customer("tuong", "nam", "tuong@gmail.com", "06/05/09", 2, 1231123, 454544848, Customer.getTypeCustomer()));
        facilityIntegerMap.put(0, new Villa("Villa1", 152, 12, 5, "thue dai han", "1", "1Dk", 4, 2));
        facilityIntegerMap.put(1, new Villa("Villa2", 1300, 12, 15, "thue dai han", "2", "1Dk", 4, 2));
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhập ID khách hàng");
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
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ");
        for (Map.Entry<Integer, Villa> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("Nhập ID dịch vụ");
        boolean check = true;
        System.out.println("1");
        String id = scanner.nextLine();
        System.out.println("2");
        while (check) {
            for (Map.Entry<Integer, Villa> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getValue().getId())) {
                    System.out.println(entry.getValue().toString());
                    check = false;
                }

            }
            if (check) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }


    @Override
    public void add() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }

    }

    @Override
    public Customer display() {
        System.out.println("Danh sách khách hàng");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhập Id của khách hàng");
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
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại ID khách hàng");
                id = Integer.parseInt(scanner.nextLine());
            }
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
