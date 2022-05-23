package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.PersonIMPL;

import java.util.Scanner;

public class RunStaff {
    public static Scanner scanner = new Scanner(System.in);

    public static void staffDisplay() {
        PersonIMPL personIMPL = new PersonIMPL();
        do {

            System.out.println(" Danh Muc Nhan Vien\n" +
                    "1. Tat Ca Nhan Vien\n" +
                    "2. Nhan Vien Cong Nhat\n" +
                    "3. Nhan Vien San Xuat\n" +
                    "4. Nhan Vien Quan Ly\n" +
                    "5. Sap xep theo luong giam\n" +
                    "6. Sap xep theo luong tang dan\n" +
                    "7. Exit " +
                    "Ban muon xem muc nao ");
            switch (scanner.nextInt()) {
                case 1:
                    PersonIMPL.displayByLinkedHashMap();     // hiển thị bằng linked
//                    PersonIMPL.allStaffDisplay();           // hiển thị bằng array list
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
                case 5:
                    PersonIMPL.sapXepLuongGiam();
                    break;
                case 6:
                    PersonIMPL.sapXepLuongtangdan();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Nhap lai");
            }
        } while (true);
    }


    public static void main(String[] args) {
        staffDisplay();
    }

}
