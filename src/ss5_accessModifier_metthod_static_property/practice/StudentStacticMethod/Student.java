package ss5_accessModifier_metthod_static_property.practice.StudentStacticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static  String college = "BBDIT";
    Student(int age , String n){
        rollNo=age;
        name=n;
    }
    static void change(){
        college ="CODEGYM";
    }
     void display(){
        System.out.println(rollNo+ " "+ name+" "+college);
    }
}
