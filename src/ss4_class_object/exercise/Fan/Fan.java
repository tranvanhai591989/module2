package ss4_class_object.exercise.Fan;

public class Fan {
    private String name;
    final int OFF = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean button = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW() {
        return SLOW;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

//    public void change(){
//        if (this.speed != 0){
//            System.out.println(this.getName() + " ON Speed :"+ this.speed);
//        }else {
//            System.out.println(this.getName() +" OFF");
//        }
//    }


    public Fan(String name, int speed, boolean off, double radius, String color) {
        this.speed = speed;
        this.button = off;
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.button && this.speed != 0) {
            return this.getName() + " ON Speed :" + this.speed + " Color : " + this.color + " Radius : " + this.radius;
        } else {
            return this.getName() + " OFF Color : " + this.color + " Radius : " + this.radius;
        }
    }
}
