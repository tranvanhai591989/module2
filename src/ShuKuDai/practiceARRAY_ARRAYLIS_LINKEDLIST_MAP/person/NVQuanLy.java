package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

public class NVQuanLy extends StaffPerson {
    private int luongCoBan;
    private double heSoLuong;

    public NVQuanLy() {
    }

    public NVQuanLy(int luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NVQuanLy(String fullName, String birthday, String address, int luongCoBan, double heSoLuong) {
        super(fullName, birthday, address);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override

    public String toString() {
        return "NVQuanLy{" + super.toString() +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                ", Tien luong = " + tienluong() +
                '}';
    }

    @Override
    public double tienluong() {
        return this.luongCoBan * heSoLuong;
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
}
