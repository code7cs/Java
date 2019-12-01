package solarSystem;

public class Vec3d {
    public double x, y, z;

    // constructor
    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Vec3d() {
        this(0, 0, 0);
    }

    public String toString() {
        return "(x:" + x + " y:" + y + " z:" + z + ")";
    }

    public static Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static Vec3d sub(Vec3d a, Vec3d b) {
        return new Vec3d(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static double dot(Vec3d a, Vec3d b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

//    public static Vec3d cross(Vec3d a, Vec3d b) {
//        return new Vec3d();
//    }

    public static double dis(Vec3d a, Vec3d b) {
        double numX = Math.pow(a.getX() - b.getX(), 2);
        double numY = Math.pow(a.getY() - b.getY(), 2);
        double numZ = Math.pow(a.getZ() - b.getZ(), 2);
        return Math.sqrt(numX + numY + numZ);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
    }
}
