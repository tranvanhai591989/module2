package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

import ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.tenkai.TinhCong;

public class NVSanXuat extends StaffPerson implements TinhCong {
    private int soSanPham;

    public NVSanXuat() {
    }

    public NVSanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NVSanXuat(String fullName, String birthday, String address, int soSanPham) {
        super(fullName, birthday, address);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int getLuong() {
        return this.soSanPham * 50000;
    }

    @Override
    public String toString() {
        return "NVSanXuat{" + super.toString() +
                "soSanPham=" + soSanPham +
                ", Tien luong = " + tienluong() +
                '}';
    }

    @Override
    public double tienluong() {
        return this.soSanPham * 50000;
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
        return 0;
    }

    @Override
    public String chamCong() {
        return "chấm cong";
    }
}
