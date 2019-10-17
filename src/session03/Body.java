package session03;

/**
 * assignment: HW3C - Body
 * author: Hanfan Wang 10442733
 */

public class Body {
    private String name;
    private double mass;
    private Vec3d x;    // position of the body in 3-space
    private Vec3d v;    // velocity
    private Vec3d a;    // acceleration

    public Body(String name, double mass, double orbDistance, double vel) {
        x = new Vec3d();    // pick a random spot at the correct orbital distance
        v = new Vec3d();
        a = new Vec3d();
        this.name = name;
        this.mass = mass;
        double randomAngle = Math.random() * 2 * Math.PI;
        x.x = orbDistance * Math.cos(randomAngle);
        x.y = orbDistance * Math.sin(randomAngle);
        v.x = vel * Math.sin(randomAngle);
        v.y = vel * Math.cos(randomAngle);

        double centripetal_acceleration = vel * vel / orbDistance;
        a.x = centripetal_acceleration * Math.cos(randomAngle);
        a.y = centripetal_acceleration * Math.sin(randomAngle);
    }

    public Vec3d set(double x, double y, double z) {
        this.x.x = x;
        this.x.y = y;
        this.x.z = z;
        return this.x;
    }

    public void zeroAcceleration() {
        a = set(0, 0, 0);
    }

    public void addAcceleration(Body b) {
        // add the acceleration due to b to a
        a = new Vec3d((a.x + b.a.x), (a.y + b.a.y), (a.z + b.a.z));
    }

    @Override
    public String toString() {
        return "{ name = " + name + ", mass = " + mass + ", x = " + x + ", v = " + v + ", a = " + a + " }";
    }

    public static void main(String[] args) {
        double earthMass = 5.97e24;
        double earthOrbitalDistance = 160e9; // meters from sun
        double earthVel = 30e3;    // Find this!!
        double moonMass = 7.35e22;    // TODO
        double moonOrbitalDistance = 3.85e8; // TODO
        double moonVel = 1.0022e3; // TODO
        // start earth and moon at the random places in circular orbits
        Body earth = new Body("Earth", earthMass, earthOrbitalDistance, earthVel);
        Body moon = new Body("Moon", moonMass, moonOrbitalDistance, moonVel);
        System.out.println(earth);  // print out position, velocity
        System.out.println(moon);
        earth.zeroAcceleration();
        System.out.println(earth);
        earth.addAcceleration(moon);
        System.out.println(earth);

    }
}
