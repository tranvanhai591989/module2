package ss5_accessModifier_metthod_static_property.practice.Car;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("CX8","Skyactiv 6");
        System.out.println("Car No : "+ Car.numberOfCar+"-" +car1.toString());
        Car car2=new Car("CX3","Skyactiv 3");
        System.out.println("Car No : "+Car.numberOfCar + car2.toString());

    }

}
