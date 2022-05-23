package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.TinhCong;

public class NVCongNhat extends StaffPerson implements TinhCong {
    private int soNgayCong;

    public NVCongNhat() {
    }

    public NVCongNhat(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NVCongNhat(String fullName, String birthday, String address, int soNgayCong) {
        super(fullName, birthday, address);
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    public double getLuong(){
        return soNgayCong*120000;
    }

    @Override
    public String toString() {
        return "NVCongNhat{" + super.toString() +
                "soNgayCong=" + soNgayCong +
                ", Tien luong = "+tienluong()+
                '}';
    }

    @Override
    public double tienluong() {
        return this.soNgayCong * 120000;
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

    @Override
    public int compare(StaffPerson o1, StaffPerson o2) {
        if (o1.tienluong()>o2.tienluong()){
            return 1;
        }else if (o1.tienluong()<o2.tienluong()){
            return -1;
        }else {
            return -1;
        }
    }

    @Override
    public String chamCong() {
        return "NV cong nhat cham cong";
    }
}
