package ss5_accessModifier_metthod_static_property.practice.StudentStacticMethod;

public class TestStaticMethodStudent {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(15,"Hoang");
        Student s2 = new Student(16,"Khanh");
        Student s3 = new Student(15,"Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
