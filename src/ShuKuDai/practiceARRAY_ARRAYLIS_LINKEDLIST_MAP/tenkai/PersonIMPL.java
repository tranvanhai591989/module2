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
        staffPeople[0] = new NVCongNhat("hai", "1/1/2", "Da Nang", 20);
        staffPeople[1] = new NVCongNhat("nhat", "2/1/2", "Da Nang", 27);
        staffPeople[2] = new NVCongNhat("trung", "3/1/2", "Da Nang", 25);
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
            System.out.println("Mã NV: " + item + ", " + integerEmployeeMap.get(item));
        }
    }

    public static void main(String[] args) {
        System.out.println(integerEmployeeMap);
    }

    public static void allStaffDisplay() {
//        for (StaffPerson item : staffPeople) {       // hiển thị danh sách bằng array
//            if (item != null) {
//                System.out.println(item);
//            }
//        }
        for (StaffPerson item : staffPeopleList) {
            System.out.println(item);
        }
    }

    public static void nvCongNhatDisplay() {
//        for (StaffPerson item : staffPeople) {               //hiển thị danh sách Nv công nhật bằng aray
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
//        for (StaffPerson item : staffPeople) {                //hiển thị danh sách Nv quan lý bằng aray
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
//        for (StaffPerson item : staffPeople) {               //hiển thị danh sách Nv sản xuất bằng aray
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
    //Không nên dùng for i để duyệt linked list, mỗi lân duyêtf phải duyệt từ đầu -> giảm hiệu suất
    //Thay đổi nhân sự liên tục nên dùng linked list
    // Khi thêm hay xóa phần tử trong linked list thì đơn giản là bẽ gãy liên kết chổ cần thêm hoặc xóa rồi nối lại địa chỉ liên kết
    //Vì vậy, Ưu điểm của linkedlist là thêm sửa xóa nhanh, nhược điểm là truy xuất phần tử chậm
    //Array list thì thao tác thêm xóa thì chậm do phải dịch chuyển các phần tử còn lại .

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
