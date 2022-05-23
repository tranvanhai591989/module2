package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.StaffPerson;

import java.util.Comparator;

public class SapxXepTheoLuongTangDan implements Comparator<StaffPerson> {
    @Override
    public int compare(StaffPerson o1, StaffPerson o2) {
        if (o1.tienluong() > o2.tienluong()) {
            return 1;
        } else if (o1.tienluong() < o2.tienluong()) {
            return -1;
        } else {
            if (o1.getFullName().compareTo(o2.getFullName()) < 0) {
                return 1;
            } else if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
