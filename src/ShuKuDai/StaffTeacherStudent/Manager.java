package ShuKuDai.StaffTeacherStudent;


import java.util.Scanner;

public class Manager {
    public static Scanner scanner = new Scanner(System.in);

    public static int id = 0;
    public static int place = 0;

    public static int stt = 1;
    public static Person[] managers = new Person[100];
    public static int[] arrId = new int[100];

    public static void add() {
        System.out.println("1 - Student\n" +
                "2 - Teacher");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.print("Set name : ");
                String name = scanner.nextLine();
                System.out.print("Set age : ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Set Gender : ");
                String gender = scanner.nextLine();
                System.out.print("Set Point : ");
                double point = Double.parseDouble(scanner.nextLine());
                Student student = new Student(stt, arrId[id], name, age, gender, point);
                managers[place] = student;
                stt++;
                id++;
                place++;
                break;
            case 2:
                System.out.print("Set name : ");
                String name1 = scanner.nextLine();
                System.out.print("Set age : ");
                int age1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Set Gender : ");
                String gender1 = scanner.nextLine();
                System.out.print("Set Salary : ");
                int salary = Integer.parseInt(scanner.nextLine());
                Teacher teacher = new Teacher(stt, arrId[id], name1, age1, gender1, salary);
                managers[place] = teacher;
                stt++;
                id++;
                place++;
                break;
        }
    }


    public static void find() {
        int check = 0;
        System.out.println("Enter char :  ");
        String chart = scanner.nextLine();
        for (Person manager : managers) {
            if (manager != null && manager.toString().contains(chart)) {
                System.out.println(manager);

            }
            check++;
        }
        if (check > 0) {
            System.out.println("Can't not find ");
        }
    }

    public static void delete() {
        int pending;
        System.out.println("Do you want delete No..");
        int no = Integer.parseInt(scanner.nextLine());
        for (int i = no - 1; i < managers.length - 1; i++) {
            managers[i] = null;
            managers[i] = managers[i + 1];
            managers[i + 1] = null;
            pending = arrId[i];                           // thay chổ bị xóa bằng các phần tử phía sau
            arrId[i] = arrId[1 + i];                  // chuyển id kề chổ bị xóa thành chổ bị xóa
            arrId[arrId.length - 1] = pending;
        }place--;id++;stt--;

        for (int i = no - 1; i < managers.length - 1; i++) {
            if (managers[i] != null) {
                managers[i].setStt(no);
                no++;
            } else {
                break;
            }
        }
        display();
    }

    public static void display() {
        for (Person manager : managers) {
            if (manager != null) {
                System.out.println(manager);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arrId.length - 1; i++) {  //tạo id riêng
            arrId[i] = 100 + i;
        }
        do {
            System.out.println(" ----ManagerStaffTeacherStudent----\n" +
                    "1 - Add\n" +
                    "2 - Find\n" +
                    "3 - Delete\n" +
                    "4 - Display\n" +
                    "5 - Exit\n" +
                    "You choose :");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    add();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}