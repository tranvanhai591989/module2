package ss6_inheritan.exercise.PointMovablePoint;

public class MovablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float x, float xSpeed, float y, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                ", x=" + x +
                "xSpeed=" + xSpeed +
                ", y=" + y +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
