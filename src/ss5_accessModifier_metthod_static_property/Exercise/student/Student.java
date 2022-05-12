package ss5_accessModifier_metthod_static_property.Exercise.student;

public class Student {
    private String name = "John";
    private String className = "C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Class : " + this.className);
    }
}
