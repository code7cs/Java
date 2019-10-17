package session03;

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
        return new Vec3d(a.x + b.x, a.y + b.y, a.z + b.z); // TODO:
    }

    public static Vec3d sub(Vec3d a, Vec3d b) {
        return new Vec3d(a.x - b.x, a.y - b.y, a.z - b.z); //TODO:
    }

    public static double dot(Vec3d a, Vec3d b) {
        return a.x * b.x + a.y * b.y + a.z * b.z; // TODO:
    }

    // Not needed this week
    public static Vec3d cross(Vec3d a, Vec3d b) {
        return new Vec3d(); // TODO:
    }

    // set the x,y,z components of the vector to these new values
    public void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vec3d v1 = new Vec3d();
        System.out.println(v1); // (0,0,0)
        Vec3d v2 = new Vec3d(1, 2, 3);
        System.out.println(v2); // (1,2,3)
        Vec3d v3 = new Vec3d(4, 1, -1);
        System.out.println(add(v2, v3)); // (5,3,2)
        System.out.println(sub(v2, v3)); // (-3,1,4)
        System.out.println(dot(v2, v3)); // 1*4+2*1+3*-1 = 3

    }
}
