package ShuKuDai.practiceARRAY_ARRAYLIS_LINKEDLIST_MAP.person;

public class NVCongNhat extends StaffPerson {
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
                '}';
    }
}
