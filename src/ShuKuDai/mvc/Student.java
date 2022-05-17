//package ShuKuDai.mvc;
//
////import management_student.service.StudentService;
////import management_student.service.StudentServiceImpl;
////
////import java.io.Serializable;
//
//public class StudentMVC extends PersonMVC {
//
//    private static String className = "C0322G1";
//
//    private  int id;
//    private double point;
//
//
//    public void check(){
//        System.out.println( super.gioiTinh() );
//    }
//
//    public static void main(String[] args) {
//
//        new StudentMVC().check();
//    }
//
//    public StudentMVC(int id, double point) {
//        this.id = id;
//        this.point = point;
//    }
//
//    @Override
//    public String gioiTinh() {
//        return "Tùy chọn";
//    }
//
//    public StudentMVC() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public StudentMVC(double point) {
//        this.point = point;
//    }
//
//    public StudentMVC(String name, int age, boolean gender, int id, double point) {
//        super(name, age, gender);
//        this.id = id;
//        this.point = point;
//    }
//    public StudentMVC(String name, int age, boolean gender,  double point) {
//        super(name, age, gender);
//        this.point = point;
//    }
//
//    public double getPoint() {
//        return point;
//    }
//
//    public void setPoint(double point) {
//        this.point = point;
//    }
//
//
//
//
////    @Override
////    public int compareTo(Student o) {
////        if ( this.getName().compareTo(o.getName()) > 0 ){
////            return 1;
////        } else if ( this.getName().compareTo(o.getName()) < 0 ){
////            return -1;
////        } else {
////            return 0;
////        }
////    }
//
//}