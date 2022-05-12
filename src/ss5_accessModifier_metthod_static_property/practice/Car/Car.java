package ss5_accessModifier_metthod_static_property.practice.Car;

public class Car {
    private String name ;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar ++;
    }

    @Override
    public String toString() {
        return "\n Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
