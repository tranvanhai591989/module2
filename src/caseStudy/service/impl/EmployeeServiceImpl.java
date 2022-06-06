package caseStudy.service.impl;

import caseStudy.Exception.*;
import caseStudy.person.Employee;
import caseStudy.service.EmployeeService;
import caseStudy.ultil.FormatString;
import caseStudy.ultil.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public static List<String[]> employee = new ArrayList<>();
    public static ArrayList<Employee> employeesList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    int employeeID;

    @Override
    public void add() throws IOException {
        employeesList.clear();
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");


        for (String[] item : employee) {
            if (item.length == 10) {
                Employee employee = new
                        Employee(item[0], item[1], item[2], Integer.parseInt(item[3]),
                        item[4], item[5], item[6], item[7], item[8],
                        Double.parseDouble(item[9]));
                employeesList.add(employee);
            }
        }


        int max = 0;
        if (employeesList.isEmpty()) {
            employeeID = 101;
        } else {
            for (Employee item : employeesList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            employeeID = max + 1;
        }


        String firstNameAndLastName;
        do {
            try {
                System.out.print("Input Name  : (Ex : Jon Smith) ");
                firstNameAndLastName = scanner.nextLine();
                if (FormatString.formatName(firstNameAndLastName)) {
                    break;
                } else {
                    throw new NameException("Wrong Format Input");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        } while (true);


        String dayOfBirth;
        do {
            try {
                System.out.print("Input birthday  : (Ex : dd/MM/yyyy) ");
                dayOfBirth = scanner.nextLine();
                if (FormatString.dateFormat(dayOfBirth)) {
                    break;
                } else {
                    throw new BirthdayException("Wrong Format Input");
                }
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }

        } while (true);


        String gender;
        do {
            try {
                System.out.print("Input gender  : (Ex : Male|Female|Other) ");
                gender = scanner.nextLine();
                if (FormatString.formatGender(gender)) {
                    break;
                } else {
                    throw new GenderException("Wrong Format Input");
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }

        } while (true);


        String phoneNumber;
        do {
            try {
                System.out.print("Input phone number : (Ex : +84707498777) ");
                phoneNumber = scanner.nextLine();
                if (FormatString.formatPhone(phoneNumber)) {
                    break;
                } else {
                    throw new PhoneNumberException("Wrong Format Input");
                }
            } catch (PhoneNumberException e) {
                System.out.println(e.getMessage());
            }

        } while (true);


        String email;
        do {
            try {
                System.out.print("Input Email : (Ex : abc123@gmail.com) ");
                email = scanner.nextLine();
                if (FormatString.formatEmail(email)) {
                    break;
                } else {
                    throw new EmailException("Wrong Format Input");
                }
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }

        } while (true);


        String employeeCode;
        do {
            System.out.print("Input employee code : (Ex : 0000 ) ");
            String beforeID = "EMID-";
            employeeCode = beforeID + scanner.nextLine();
            if (FormatString.code(employeeCode)) {
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        } while (true);


        double salary = 0;
        boolean flag;
        do {
            try {
                System.out.print("Input Salary:");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary > 0) {
                    flag = false;
                } else {
                    System.out.println("Retype ");
                    flag = true;
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = true;
            }
        } while (flag);

        Employee employee = new Employee(firstNameAndLastName, dayOfBirth, gender, employeeID, phoneNumber, email, employeeCode, getLevel(), getLocation(), salary);
        employeesList.add(employee);

        String line = employee.getInfo();

        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv", line);
        System.out.println("Add successful");
    }

    @Override
    public void display() {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            if (item.length == 10) {
                Employee employee = new
                        Employee(item[0], item[1], item[2], Integer.parseInt(item[3]),
                        item[4], item[5], item[6], item[7],
                        item[8], Double.parseDouble(item[9]));
                employeesList.add(employee);
            }

        }
        System.out.println("Employee List");
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }

    }


    @Override
    public void update() throws IOException {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            Employee employee = new Employee(
                    item[0],
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    item[6],
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
            String firstNameAndLastName;
            do {
                System.out.println("Input Name  : (Ex : Jon Smith) ");
                firstNameAndLastName = scanner.nextLine();
                if (FormatString.formatName(firstNameAndLastName)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            String dayOfBirth;
            do {
                System.out.println("Input birthday  : (Ex : dd/MM/yyyy) ");
                dayOfBirth = scanner.nextLine();
                if (FormatString.dateFormat(dayOfBirth)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            String gender;
            do {
                System.out.println("Input gender  : (Ex : Male|Female|Other) ");
                gender = scanner.nextLine();
                if (FormatString.formatGender(gender)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            String phoneNumber;
            do {
                System.out.println("Input phone number : (Ex : +84707498777) ");
                phoneNumber = scanner.nextLine();
                if (FormatString.formatPhone(phoneNumber)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            String email;
            do {
                System.out.println("Input Email : (Ex : abc123@gmail.com) ");
                email = scanner.nextLine();
                if (FormatString.formatEmail(email)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            String employeeCode;
            do {
                System.out.println("Input employee code : (Ex : EMID-0000) ");
                employeeCode = scanner.nextLine();
                if (FormatString.code(employeeCode)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input");
                }
            } while (true);


            double salary = 0;
            boolean flag;
            do {
                try {
                    System.out.println("Input Salary:");
                    salary = Double.parseDouble(scanner.nextLine());
                    if (salary > 0) {
                        flag = false;
                    } else {
                        System.out.println("Retype ");
                        flag = true;
                    }

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    flag = true;
                }
            } while (flag);


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
    public void delete() throws IOException {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            Employee employee = new Employee(
                    item[0],
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    item[6],
                    item[7],
                    item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Input the ID you want Delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getId() == idDelete) {
                employeesList.remove(i);
                System.out.println("Delete successful ");
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
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

    }


    @Override
    public void search() {
        employee = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\caseStudy\\data\\Employee.csv");
        employeesList.clear();
        for (String[] item : employee) {
            Employee employee = new Employee(
                    item[0],
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    item[6],
                    item[7],
                    item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Input the ID you want Find");
        String findName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getFirstNameAndLastName().contains(findName)) {
                System.out.println(employeesList.get(i));
                check = true;
            } else {
                check = false;
            }
        }
        if (check = false) {
            System.out.println("Find not found");
        }

    }
}

