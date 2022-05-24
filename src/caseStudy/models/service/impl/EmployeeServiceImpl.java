package caseStudy.models.service.impl;

import caseStudy.models.person.Employee;
import caseStudy.models.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public static int id = 104;
    public static Scanner scanner = new Scanner(System.in);

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Nguyễn Hữu Đức", "Nam", "nguyenhuuduc@gmail.com", "07/5/1995", 101, 987456321, 101, 15000000, "Receptional", "Trung cấp"));
        employeeList.add(new Employee("Lê Thanh Tâm", "Nam", "abc123@gmail.com", "15/5/1999", 102, 852963, 102, 12000000, "Receptional", "Trung cấp"));
        employeeList.add(new Employee("Nguyễn Thị Thanh", "Nữ", "xyz123@gmail.com", "12/6/2000", 103, 456321, 103, 13000000, "Receptional", "Trung cấp"));
    }

    @Override
    public void add() {
        System.out.println(" Enter the name : ");
        String name = scanner.nextLine();
        System.out.println(" Enter the gender : ");
        String gender = scanner.nextLine();
        System.out.println(" Enter the email : ");
        String email = scanner.nextLine();
        System.out.println(" Enter the birthday : ");
        String birthday = scanner.nextLine();
        System.out.println(" Enter the phone number : ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(" Enter salary : ");
        int salary = Integer.parseInt(scanner.nextLine());
        employeeList.add(new Employee(name, gender, email, birthday, id, phoneNumber, id, salary, getJobPosition(), getDegree()));
        id++;
    }

    @Override
    public void display() {
        for (Employee item : employeeList) {
            System.out.println(item);
        }

    }

    @Override
    public void delete() {
        System.out.println("Input the Id you want delete");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(employeeList.get(i));
            }
        }

    }

    @Override
    public void update() {
        System.out.println("Input the Id you want edit ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println(" Enter the name : ");
                String name = scanner.nextLine();
                System.out.println(" Enter the gender : ");
                String gender = scanner.nextLine();
                System.out.println(" Enter the email : ");
                String email = scanner.nextLine();
                System.out.println(" Enter the birthday : ");
                String birthday = scanner.nextLine();
                System.out.println(" Enter the phone number : ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(" Enter job position : ");
                String jobPosition = scanner.nextLine();
                System.out.println(" Enter degree : ");
                String degree = scanner.nextLine();
                System.out.println(" Enter salary : ");
                int salary = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setFirstNameLastName(name);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setDayOfBirth(birthday);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setJobPosition(jobPosition);
                employeeList.get(i).setDegree(degree);
                employeeList.get(i).setSalary(salary);
            }
        }

    }

    @Override
    public void search() {
        for (int i = 0; i <employeeList.size() ; i++) {

        }

    }
}
