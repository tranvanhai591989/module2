package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

public class NVSanXuat extends StaffPerson {
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
    public int getLuong(){
        return this.soSanPham*50000;
    }

    @Override
    public String toString() {
        return "NVSanXuat{" + super.toString() +
                "soSanPham=" + soSanPham +
                '}';
    }
}
