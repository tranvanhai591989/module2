package ss6_inheritan.practice;

public class Circle  extends  Shape{
    private double radius= 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,Boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double  getPerimeter(){
        return radius*Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " Circle Area : "+getArea()
                +"\n"+" Circle perimeter : "+getPerimeter()
                + "\n"+" which is a subclass of "
                + super.toString();
    }

}
