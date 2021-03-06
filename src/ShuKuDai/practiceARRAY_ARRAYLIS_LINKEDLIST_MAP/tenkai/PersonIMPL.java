package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVCongNhat;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVQuanLy;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.NVSanXuat;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.StaffPerson;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck.SapXepLuongGiamDan;
import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck.SapxXepTheoLuongTangDan;

import java.util.*;

public class PersonIMPL implements NVInterface {
    public static Scanner scanner = new Scanner(System.in);
    public static StaffPerson[] staffPeople = new StaffPerson[1000];
    public static ArrayList<StaffPerson> staffPeopleList = new ArrayList<>();
    public static LinkedList<StaffPerson> staffPeopleLinkedList = new LinkedList<>();
    static Map<Integer, StaffPerson> integerEmployeeMap = new LinkedHashMap<>();


    static {
        staffPeople[0] = new NVCongNhat("hai", "1/1/2", "Da Nang", 27);
        staffPeople[1] = new NVCongNhat("nhat", "2/1/2", "Da Nang", 27);
        staffPeople[2] = new NVCongNhat("trung", "3/1/2", "Da Nang", 27);
        staffPeople[3] = new NVCongNhat("my", "4/1/2", "Da Nang", 14);
        staffPeople[4] = new NVCongNhat("uc", "5/1/2", "Da Nang", 24);

        staffPeople[5] = new NVQuanLy("Tien", "2/2/1995", "Quang Tri", 900, 3.2);
        staffPeople[6] = new NVQuanLy("Cong", "3/2/1995", "Quang Tri", 600, 3.2);
        staffPeople[7] = new NVQuanLy("Chien", "4/2/1995", "Quang Tri", 1000, 3.2);
        staffPeople[8] = new NVQuanLy("Quang", "5/2/1995", "Quang Tri", 800, 3.2);
        staffPeople[9] = new NVQuanLy("Trung", "6/2/1995", "Quang Tri", 5000, 3.2);

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
        for (int i = 0; i < staffPeople.length; i++) {
            if (staffPeople[i] != null) {
                integerEmployeeMap.put(i, staffPeople[i]);
            }
        }

    }

    public static void displayByLinkedHashMap() {
        Set<Integer> keySet = integerEmployeeMap.keySet();
        for (Integer item : keySet) {
            System.out.println("M?? NV: " + item + ", " + integerEmployeeMap.get(item));
        }
    }

    public static void main(String[] args) {
        System.out.println(integerEmployeeMap);
    }

    public static void allStaffDisplay() {
//        for (StaffPerson item : staffPeople) {       // hi???n th??? danh s??ch b???ng array
//            if (item != null) {
//                System.out.println(item);
//            }
//        }
        for (StaffPerson item : staffPeopleList) {
            System.out.println(item);
        }
    }

    public static void nvCongNhatDisplay() {
//        for (StaffPerson item : staffPeople) {               //hi???n th??? danh s??ch Nv c??ng nh???t b???ng aray
//            if (item instanceof NVCongNhat) {
//                System.out.println(item);
//            }
//        }
        for (StaffPerson staffPerson : staffPeopleList) {
            if (staffPerson instanceof NVCongNhat) {
                System.out.println(staffPerson);
            }
        }
    }

    public static void nvQuanLyDisplay() {
//        for (StaffPerson item : staffPeople) {                //hi???n th??? danh s??ch Nv quan l?? b???ng aray
//            if (item instanceof NVQuanLy) {
//                System.out.println(item);
//            }
//        }
        for (StaffPerson staffPerson : staffPeopleList) {
            if (staffPerson instanceof NVQuanLy) {
                System.out.println(staffPerson);
            }
        }
    }

    public static void nvSanXuatDisplay() {
//        for (StaffPerson item : staffPeople) {               //hi???n th??? danh s??ch Nv s???n xu???t b???ng aray
//            if (item instanceof NVSanXuat) {
//                System.out.println(item);
//            }
//        }
        for (StaffPerson staffPerson : staffPeopleList) {
            if (staffPerson instanceof NVQuanLy) {
                System.out.println(staffPerson);
            }
        }
    }
    //Kh??ng n??n d??ng for i ????? duy???t linked list, m???i l??n duy??tf ph???i duy???t t??? ?????u -> gi???m hi???u su???t
    //Thay ?????i nh??n s??? li??n t???c n??n d??ng linked list
    // Khi th??m hay x??a ph???n t??? trong linked list th?? ????n gi???n l?? b??? g??y li??n k???t ch??? c???n th??m ho???c x??a r???i n???i l???i ?????a ch??? li??n k???t
    //V?? v???y, ??u ??i???m c???a linkedlist l?? th??m s???a x??a nhanh, nh?????c ??i???m l?? truy xu???t ph???n t??? ch???m
    //Array list th?? thao t??c th??m x??a th?? ch???m do ph???i d???ch chuy???n c??c ph???n t??? c??n l???i .

    @Override
    public void displayNV() {

    }

    @Override
    public void luong() {

    }

    @Override
    public void luongGiam() {
    }


    @Override
    public void luongTang() {

    }

    public static void sapXepLuongGiam() {
        staffPeopleList.sort(new SapXepLuongGiamDan());
        allStaffDisplay();

    }

    public static void sapXepLuongtangdan() {
        staffPeopleList.sort(new SapxXepTheoLuongTangDan());
        allStaffDisplay();

    }
}
