package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.NVInterface;

import java.util.Comparator;

public abstract class StaffPerson implements NVInterface, Comparator<StaffPerson> {
    private String fullName;
    private String birthday;
    private String address;

    public StaffPerson() {
    }

    public StaffPerson(String fullName, String birthday, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StaffPerson{" +
                "fullName =" + fullName + '\'' +
                ", birthday = " + birthday + '\'' +
                ", address= " + address + '\'' +
                '}';
    }


    @Override
    public void displayNV() {

    }

    public abstract double tienluong();
}
