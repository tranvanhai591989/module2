package ss4_class_object.exercise.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan("fan 1 ", 3, true, 10, "Yellow");
        Fan fan2 = new Fan("fan 2", 1, false, 5, "Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
