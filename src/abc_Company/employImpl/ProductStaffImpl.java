package abc_Company.employImpl;

import abc_Company.employee.ProductionStaff;
import caseStudy.Exception.BirthdayException;
import caseStudy.Exception.NameException;
import caseStudy.ultil.FormatString;
import caseStudy.ultil.ReadAndWrite;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductStaffImpl implements EmployeeImpl {
    public static List<String[]> productStaff = new ArrayList<>();
    public static ArrayList<ProductionStaff> productStaffList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static int productStaffId;
    final String PATH = "D:\\codegym_java\\untitled\\src\\abc_Company\\data\\productList.csv";

    @Override
    public void add() throws IOException {
        productStaffList.clear();
        productStaff = ReadAndWrite.readerFile(PATH);
        for (String[] item : productStaff) {
            if (item.length == 7) {

                ProductionStaff productStaff = new ProductionStaff(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], Integer.parseInt(item[5]), Integer.parseInt(item[6]));
                productStaffList.add(productStaff);
            }
        }
        int max = 0;
        String productStaffCode = "";
        if (productStaffList.isEmpty()) {
            productStaffId = 2000;
        } else {
            for (ProductionStaff item : productStaffList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            productStaffId = max + 1;

        }
        productStaffCode = "PSC-" + (productStaffId + 1 + 2000);


        String nameProductStaff;
        do {
            try {
                System.out.print("Input Name  : (Ex : Jon Smith) ");
                nameProductStaff = scanner.nextLine();
                if (FormatString.formatName(nameProductStaff)) {
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

        int count = 0;
        boolean flag;
        do {
            try {
                System.out.print("Input count :");
                count = Integer.parseInt(scanner.nextLine());
                if (count > 0) {
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

        int price = 0;
        boolean flag1;
        do {
            try {
                System.out.print("Input Price:");
                price = Integer.parseInt(scanner.nextLine());
                if (price > 0) {
                    flag1 = false;
                } else {
                    System.out.println("Retype ");
                    flag1 = true;
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag1 = true;
            }
        } while (flag1);

        System.out.print("Enter address");
        String address = scanner.nextLine();

        ProductionStaff productStaff = new ProductionStaff(productStaffId, productStaffCode, nameProductStaff, dayOfBirth, address, count, price);
        productStaffList.add(productStaff);
        String line = productStaff.getInfo();
        ReadAndWrite.writeFile(PATH, line);
    }

    @Override
    public void edit() {
        productStaffList.clear();
        productStaff = ReadAndWrite.readerFile(PATH);

        for (String[] item : productStaff) {
            ProductionStaff productStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]));
            productStaffList.add(productStaff);
        }
        System.out.print("Input the manager Code you want Edit  :  (Ex: PSC-0000)  ");
        boolean check = false;
        String editCode;
        try {
            editCode = scanner.nextLine();
            for (int i = 0; i < productStaffList.size(); i++) {
                if (productStaffList.get(i).getCode().equals(editCode)) {
                    String nameProductStaff;
                    do {
                        try {
                            System.out.print("Input Name  : (Ex : Jon Smith) ");
                            nameProductStaff = scanner.nextLine();
                            if (FormatString.formatName(nameProductStaff)) {
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

                    int count = 0;
                    boolean flag;
                    do {
                        try {
                            System.out.print("Input count :");
                            count = Integer.parseInt(scanner.nextLine());
                            if (count > 0) {
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

                    int count1 = 0;
                    boolean flag1;
                    do {
                        try {
                            System.out.print("Input count :");
                            count = Integer.parseInt(scanner.nextLine());
                            if (count > 0) {
                                flag1 = false;
                            } else {
                                System.out.println("Retype ");
                                flag = true;
                            }

                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            flag = true;
                        }
                    } while (flag);

                    int price = 0;
                    boolean flag2 = false;
                    do {
                        try {
                            System.out.print("Input Price:");
                            price = Integer.parseInt(scanner.nextLine());
                            if (price > 0) {
                                flag2 = false;
                            } else {
                                System.out.println("Retype ");
                                flag2 = true;
                            }

                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            flag1 = true;
                        }
                    } while (flag2);


//               String name, String birthday, String address, int countProduct, int priceProduct)
                    System.out.print("Enter address");
                    String address = scanner.nextLine();
                    productStaffList.get(i).setName(nameProductStaff);
                    productStaffList.get(i).setBirthday(dayOfBirth);
                    productStaffList.get(i).setAddress(address);
                    productStaffList.get(i).getCountProduct();
                    productStaffList.get(i).getPriceProduct();
                    ReadAndWrite.clearFile(PATH);
                    for (ProductionStaff item : productStaffList) {
                        String line =
                                item.getId() + "," +
                                        item.getCode() + "," +
                                        item.getName() + "," +
                                        item.getBirthday() + "," +
                                        item.getAddress() + "," +
                                        item.getCountProduct() + "," +
                                        item.getPriceProduct();
                        ReadAndWrite.writeFile(PATH, line);

                    }
                    System.out.println("Edit successful ");
                    break;
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
        productStaff = ReadAndWrite.readerFile(PATH);
        productStaffList.clear();
        for (String[] item : productStaff) {
            ProductionStaff productionStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Integer.parseInt(item[6]));
            productStaffList.add(productionStaff);
        }
        System.out.println("Input the ID you want Delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < productStaffList.size(); i++) {
            if (productStaffList.get(i).getId() == idDelete) {
                productStaffList.remove(i);
                System.out.println("Delete successful ");
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
        ReadAndWrite.clearFile(PATH);
        for (ProductionStaff item : productStaffList) {
            String line =
                    item.getId() + "," +
                            item.getCode() + "," +
                            item.getName() + "," +
                            item.getBirthday() + "," +
                            item.getAddress() + "," +
                            item.getCountProduct() + "," +
                            item.getPriceProduct();

            ReadAndWrite.writeFile(PATH, line);

        }
    }

    @Override
    public void display() {
        productStaff = ReadAndWrite.readerFile(PATH);
        productStaffList.clear();
        for (String[] item : productStaff) {
            if (item.length == 7) {
                ProductionStaff productionStaff = new ProductionStaff(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], Integer.parseInt(item[5]), Integer.parseInt(item[6]));
                productStaffList.add(productionStaff);

            }

        }
        System.out.println("Manager List");
        for (ProductionStaff productionStaff : productStaffList) {
            System.out.println(productionStaff);
        }


    }
}
