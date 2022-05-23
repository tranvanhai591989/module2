package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVSanXuat;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.NVInterface;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.PersonIMPL;

import java.util.Scanner;

public class RunStaff implements NVInterface {
    public static Scanner scanner = new Scanner(System.in);

    public static void staffDisplay() {
        do {
            System.out.println(" Danh Muc Nhan Vien\n" +
                    "1. Tat Ca Nhan Vien\n" +
                    "2. Nhan Vien Cong Nhat\n" +
                    "3. Nhan Vien San Xuat\n" +
                    "4. Nhan Vien Quan Ly\n " +
                    "Ban muon xem muc nao ");
            switch (scanner.nextInt()) {
                case 1:
                    PersonIMPL.allStaffDisplay();
                    break;
                case 2:
                    PersonIMPL.nvCongNhatDisplay();
                    break;
                case 3:
                    PersonIMPL.nvSanXuatDisplay();
                    break;
                case 4:
                    PersonIMPL.nvQuanLyDisplay();
                    break;
            }
        } while (true);
    }


    public static void main(String[] args) {
        staffDisplay();
    }

    @Override
    public void displayNV() {

    }

    @Override
    public void luong() {

    }
}
