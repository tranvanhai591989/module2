package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVCongNhat;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVQuanLy;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVSanXuat;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.StaffPerson;
import sun.rmi.transport.proxy.RMISocketInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonIMPL {
    public static Scanner scanner = new Scanner(System.in);
    public static StaffPerson[] staffPeople = new StaffPerson[1000];
    public static ArrayList<StaffPerson> staffPeopleList = new ArrayList<>();
    public static LinkedList<StaffPerson> staffPeopleLinkedList = new LinkedList<>();

    static {
        staffPeople[0] = new NVCongNhat("15/02/1999", "1/1/2", "Da Nang", 20);
        staffPeople[1] = new NVCongNhat("16/02/1999", "2/1/2", "Da Nang", 21);
        staffPeople[2] = new NVCongNhat("17/02/1999", "3/1/2", "Da Nang", 22);
        staffPeople[3] = new NVCongNhat("18/02/1999", "4/1/2", "Da Nang", 23);
        staffPeople[4] = new NVCongNhat("19/02/1999", "5/1/2", "Da Nang", 24);

        staffPeople[5] = new NVQuanLy("Tien", "2/2/1995", "Quang Tri", 5000000, 3.2);
        staffPeople[6] = new NVQuanLy("Cong", "3/2/1995", "Quang Tri", 6000000, 3.2);
        staffPeople[7] = new NVQuanLy("Chien", "4/2/1995", "Quang Tri", 7000000, 3.2);
        staffPeople[8] = new NVQuanLy("Quang", "5/2/1995", "Quang Tri", 8000000, 3.2);
        staffPeople[9] = new NVQuanLy("Trung", "6/2/1995", "Quang Tri", 9000000, 3.2);

        staffPeople[10] = new NVSanXuat("Hung", "3/3/1996", "HCM", 50);
        staffPeople[11] = new NVSanXuat("Hoang", "4/3/1996", "HCM", 55);
        staffPeople[12] = new NVSanXuat("Dong", "5/3/1996", "HCM", 66);
        staffPeople[13] = new NVSanXuat("Tuan", "6/3/1996", "HCM", 77);
        for (int i = 0; i < staffPeople.length; i++) {
            if (staffPeople[i] != null) {
                staffPeopleList.add(staffPeople[i]);
            }
        }
        for (int i = 0; i < staffPeople.length; i++) {
            if (staffPeople[i] != null) {
                staffPeopleLinkedList.add(staffPeople[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(staffPeopleLinkedList);
        System.out.println(staffPeopleLinkedList.size());
    }

    public static void allStaffDisplay() {
        for (StaffPerson item : staffPeople) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void nvCongNhatDisplay() {
        for (StaffPerson item : staffPeople) {
            if (item instanceof NVCongNhat) {
                System.out.println(item);
            }
        }
    }

    public static void nvQuanLyDisplay() {
        for (StaffPerson item : staffPeople) {
            if (item instanceof NVQuanLy) {
                System.out.println(item);
            }
        }
    }

    public static void nvSanXuatDisplay() {
        for (StaffPerson item : staffPeople) {
            if (item instanceof NVSanXuat) {
                System.out.println(item);
            }
        }
    }
}
