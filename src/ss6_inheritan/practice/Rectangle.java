package ss6_inheritan.practice;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length =1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color , Boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double gePerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with Width = "+ getWidth()
                +" and Length " + getLength()
                +"\n Rectangle Area = " + getArea()
                + "Rectangle Perimeter = "+ gePerimeter()
                +"\n , Which is a subclass of "+ super.toString();
    }
}
