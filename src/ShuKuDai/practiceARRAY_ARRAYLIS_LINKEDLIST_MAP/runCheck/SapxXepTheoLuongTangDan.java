package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.runCheck;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person.StaffPerson;

import java.util.Comparator;

public class SapxXepTheoLuongTangDan implements Comparator<StaffPerson> {

    public String getName(String fullName){
        String s= fullName.trim();
        if (s.contains(" ")){
            int vt= s.lastIndexOf(" ");
            return  s.substring(vt+1);
        }else {
            return s;
        }
    }

    @Override
    public int compare(StaffPerson o1, StaffPerson o2) {
     String strO1 = getName(o1.getFullName());
     String strO2 = getName(o2.getFullName());

        if (o1.tienluong() > o2.tienluong()) {
            return 1;
        } else if (o1.tienluong() < o2.tienluong()) {
            return -1;
        } else {
            if (strO1.compareTo(strO2) < 0) {
                return 1;
            } else if (strO1.compareTo(strO2) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
