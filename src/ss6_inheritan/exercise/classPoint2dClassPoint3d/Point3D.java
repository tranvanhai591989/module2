package ss6_inheritan.exercise.classPoint2dClassPoint3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {

        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), this.z};
    }


    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
