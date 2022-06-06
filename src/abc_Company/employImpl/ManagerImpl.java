package abc_Company.employImpl;

import abc_Company.employee.Manager;
import caseStudy.Exception.BirthdayException;
import caseStudy.Exception.NameException;
import caseStudy.ultil.FormatString;
import caseStudy.ultil.ReadAndWrite;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerImpl extends Manager implements EmployeeImpl {
    public static List<String[]> manager = new ArrayList<>();
    public static ArrayList<Manager> managerList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int managerID;

    @Override
    public void add() throws IOException {
        managerList.clear();
        manager = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");
        for (String[] item : manager) {
            if (item.length == 6) {
//                (int id, String code, String name, String birthday,
//                String address, int salary)
                Manager manager = new Manager(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], Integer.parseInt(item[5]));
                managerList.add(manager);
            }
        }
        int max = 0;
        String managerCode = "";
        if (managerList.isEmpty()) {
            managerID = 100;
        } else {
            for (Manager item : managerList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            managerID = max + 1;

        }
        managerCode = "MG-" + (managerID + 1 + 100);


        String nameManger;
        do {
            try {
                System.out.print("Input Name  : (Ex : Jon Smith) ");
                nameManger = scanner.nextLine();
                if (FormatString.formatName(nameManger)) {
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

                LocalDate dayNow = LocalDate.now();

                LocalDate star = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/LL/yyyy"));

                if (FormatString.dateFormat(dayOfBirth)&&star.plusYears(18).isBefore(dayNow)) {
                    break;
                } else {
                    throw new BirthdayException("Wrong Format Input\n" +
                            "(Age <18)");
                }
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }

        } while (true);

        int salary = 0;
        boolean flag;
        do {
            try {
                System.out.print("Input Salary:");
                salary = Integer.parseInt(scanner.nextLine());
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

        System.out.print("Enter address");
        String address = scanner.nextLine();
        Manager manager = new Manager(managerID, managerCode, nameManger, dayOfBirth, address, salary);
        managerList.add(manager);
        String line = manager.getInfo();
        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv", line);
    }

    @Override
    public void edit() {
        managerList.clear();
        manager = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");

        for (String[] item : manager) {
            Manager manager = new Manager(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]));
            managerList.add(manager);
        }
        System.out.print("Input the manager Code you want Edit  :  (Ex: MG-000)  ");
        boolean check = false;
        String editCode;
        try {
            editCode = scanner.nextLine();
            for (int i = 0; i < managerList.size(); i++) {
                if (managerList.get(i).getCode().equals(editCode)) {
                    String nameManger;
                    do {
                        try {
                            System.out.print("Input Name  : (Ex : Jon Smith) ");
                            nameManger = scanner.nextLine();
                            if (FormatString.formatName(nameManger)) {
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

                            LocalDate dayNow = LocalDate.now();

                            LocalDate star = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/LL/yyyy"));

                            if (FormatString.dateFormat(dayOfBirth)&&star.plusYears(18).isBefore(dayNow)) {
                                break;
                            } else {
                                throw new BirthdayException("Wrong Format Input\n" +
                                        "(Age <18)");
                            }
                        } catch (BirthdayException e) {
                            System.out.println(e.getMessage());
                        }

                    } while (true);

                    int salary = 0;
                    boolean flag;
                    do {
                        try {
                            System.out.print("Input Salary:");
                            salary = Integer.parseInt(scanner.nextLine());
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

                    System.out.print("Enter address");
                    String address = scanner.nextLine();
                    managerList.get(i).setName(nameManger);
                    managerList.get(i).setBirthday(dayOfBirth);
                    managerList.get(i).setSalary(salary);
                    managerList.get(i).setAddress(address);
                    ReadAndWrite.clearFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");
                    for (Manager item : managerList) {
                        String line =
                                item.getId() + "," +
                                        item.getCode() + "," +
                                        item.getName() + "," +
                                        item.getBirthday() + "," +
                                        item.getAddress() + "," +
                                        item.getSalary();
                        ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv", line);

                    }
                    System.out.println("Edit successful ");
                } else {
                    System.out.println("ID not exist");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() throws IOException {
        manager = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");
        managerList.clear();
        for (String[] item : manager) {
            Manager manager = new Manager(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]));
            managerList.add(manager);
        }
        System.out.println("Input the ID you want Delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < managerList.size(); i++) {
            if (managerList.get(i).getId() == idDelete) {
                managerList.remove(i);
                System.out.println("Delete successful ");
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
        ReadAndWrite.clearFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");
        for (Manager item : managerList) {
            String line =
                    item.getId() + "," +
                            item.getCode() + "," +
                            item.getName() + "," +
                            item.getBirthday() + "," +
                            item.getAddress() + "," +
                            item.getSalary();
            ReadAndWrite.writeFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv", line);

        }
    }

    @Override
    public void display() {
        manager = ReadAndWrite.readerFile("D:\\codegym_java\\untitled\\src\\abc_Company\\data\\managerList.csv");
        managerList.clear();
        for (String[] item : manager) {
            if (item.length == 6) {
                Manager manager = new Manager(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], Integer.parseInt(item[5]));
                managerList.add(manager);
            }
        }
        System.out.println("Manager List");
        for (Manager manager : managerList) {
            System.out.println(manager);
        }


    }
}
