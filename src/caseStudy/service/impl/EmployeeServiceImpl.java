package caseStudy.service.impl;

import caseStudy.ultil.ReadAndWrite;
import caseStudy.person.Employee;
import caseStudy.service.EmployeeService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public  static  List<String[]> employee = new ArrayList<>();
    public  static  ArrayList<Employee> employeesList = new ArrayList<>();
    public  static Scanner scanner = new Scanner(System.in);
    int employeeID = 1;

    @Override
    public void add() throws IOException {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");

        employeesList.clear();

        for (String[] item : employee) {
            Employee employee = new
                    Employee(item[0], Integer.parseInt(item[1]), item[2], Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), item[7], item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);

        }
        if (employeesList.isEmpty()) {
            employeeID = 101;
        } else {
            employeeID = employeesList.get(employeesList.size() - 1).getId() + 1;
        }

        System.out.println("Input Name  : ");
        String firstNameAndLastName = scanner.nextLine();

        System.out.println("Input birthday");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());

        System.out.println("Input gender");
        String gender = scanner.nextLine();

        System.out.println("Input phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Input Email:");
        String email = scanner.nextLine();

        System.out.println("Input employee code");
        int employeeCode = Integer.parseInt(scanner.nextLine());

        System.out.println("Input salary:");
        double salary = Double.parseDouble(scanner.nextLine());


        Employee employee = new Employee(firstNameAndLastName, dayOfBirth, gender, employeeID, phoneNumber, email, employeeCode, getLevel(), getLocation(), salary);
        employeesList.add(employee);

        String line = firstNameAndLastName + "," +
                dayOfBirth + "," +
                gender + "," +
                employeeID + "," + phoneNumber + "," +
                email + "," +
                employeeCode + "," +
                getLevel2() + "," +
                getLocation2() + "," +
                salary;
        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv", line);
        System.out.println("Add successful");
    }

    @Override
    public void display() {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            Employee employee = new
                    Employee(item[0], Integer.parseInt(item[1]), item[2], Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), item[7],
                    item[8], Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Employee List");
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }

    }

    @Override
    public void delete() {
    }

    @Override
    public void update() throws IOException {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            Employee employee = new Employee(
                    item[0],
                    Integer.parseInt(item[1]),
                    item[2],
                    Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    Integer.parseInt(item[6]),
                    item[7],
                    item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Input the ID you want update");
        boolean check = false;
        int index = 0;
        int idUpdate;
        try {
            idUpdate = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < employeesList.size(); i++) {
                if (employeesList.get(i).getId() == idUpdate) {
                    check = true;
                    index = i;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (check) {
            System.out.println("Input Name : ");
            String firstNameAndLastName = scanner.nextLine();

            System.out.println("Input birthday :");
            int dayOfBirth = Integer.parseInt(scanner.nextLine());

            System.out.println("Input Gender");
            String gender = scanner.nextLine();

            System.out.println(" Input Phone Number:");
            int phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Input Email:");
            String email = scanner.nextLine();

            System.out.println("Input employee code :");
            int employeeCode = Integer.parseInt(scanner.nextLine());

            System.out.println("Input Salary:");
            double salary = Double.parseDouble(scanner.nextLine());

            employeesList.get(index).setFirstNameAndLastName(firstNameAndLastName);
            employeesList.get(index).setDayOfBirth(dayOfBirth);
            employeesList.get(index).setGender(gender);
            employeesList.get(index).setPhoneNumber(phoneNumber);
            employeesList.get(index).setEmail(email);
            employeesList.get(index).setEmployeeCode(employeeCode);
            employeesList.get(index).setLevel(getLevel());
            employeesList.get(index).setLocation(getLocation());
            employeesList.get(index).setSalary(salary);
            ReadAndWrite.clearFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
            for (Employee item : employeesList) {
                String line =
                        item.getFirstNameAndLastName() + "," +
                                item.getDayOfBirth() + "," +
                                item.getGender() + "," +
                                item.getId() + "," +
                                item.getPhoneNumber() + "," +
                                item.getEmail() + "," +
                                item.getEmployeeCode() + "," +
                                item.getLevel2() + "," +
                                item.getLocation2() + "," +
                                item.getSalary();
                ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv", line);
            }
            System.out.println("Edit successful ");
        } else {
            System.out.println("ID not exist");
        }
    }

    @Override
    public void search() {

    }
}
