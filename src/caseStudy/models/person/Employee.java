package caseStudy.models.person;

import caseStudy.models.service.EmployeeService;

import java.util.Scanner;


public class Employee extends Person implements EmployeeService {
    private int employeeCode;
    private int salary;
    private String jobPosition; // Vị trí
    private String degree;      // Trình độ

    public static Scanner scanner = new Scanner(System.in);

    public Employee() {
    }

    public Employee(int employeeCode, int salary, String jobPosition, String degree) {
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.degree = degree;
    }

    public Employee(String firstNameLastName, String gender, String email, String dayOfBirth, int id, int phoneNumber, int employeeCode, int salary, String jobPosition, String degree) {
        super(firstNameLastName, gender, email, dayOfBirth, id, phoneNumber);
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.degree = degree;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobPosition() {
        do {
            System.out.println("1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. , Quản lý\n" +
                    "6. Giám đốc\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 6) {
                switch (chanel) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return " Quản lý";
                    case 6:
                        return "Giám đốc";
                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDegree() {
        do {
            System.out.println("1. Intermediate\n" +
                    "2. Colleges\n" +
                    "3. University\n" +
                    "4. After University\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 4) {
                switch (chanel) {
                    case 1:
                        return "Intermediate";
                    case 2:
                        return "Colleges";
                    case 3:
                        return "University";
                    case 4:
                        return "After University";
                }
                break;
            } else {
                System.out.println("Please Retype");
            }

        } while (true);
        return " ";
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Code : " + employeeCode +
                ", salary : " + salary +
                ", Position : " + jobPosition + '\'' +
                ", degree:" + degree;
    }


    @Override
    public void add() {

    }

    @Override
    public Customer display() {

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
