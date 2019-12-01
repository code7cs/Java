package solarSystem;

public class BodyBean {
    private String name;
    private String orbits;
    private double mass;
    private double diameter;
    private Double perihelion;
    private Double aphelion;
    private String rotationalPeriod;
    private String axialtilt;
    private String orbinclin;
    private double meanDistance;
    private Vec3d vec3d;

    private double accelerations;

    public BodyBean() {
    }

    public void setName(String v) {
        name = v;
    }

    public String getName() {
        return name;
    }

    public void setOrbits(String v) {
        orbits = v;
    }

    public String getOrbits() {
        return orbits;
    }

    public void setMass(double v) {
        mass = v;
    }

    public double getMass() {
        return mass;
    }

    public void setDiameter(double v) {
        diameter = v;
    }

    public double getDiameter() {
        return diameter;
    }

    public Double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(Double v) {
        perihelion = v;
    }

    public Double getAphelion() {
        return aphelion;
    }

    public void setAphelion(Double v) {
        aphelion = v;
    }

    public String getRotationalPeriod() {
        return rotationalPeriod;
    }

    public void setRotationalPeriod(String v) {
        rotationalPeriod = v;
    }

    public String getAxialtilt() {
        return axialtilt;
    }

    public void setAxialtilt(String v) {
        axialtilt = v;
    }

    public String getOrbinclin() {
        return orbinclin;
    }

    public void setOrbinclin(String v) {
        orbinclin = v;
    }

    public double getMeanDistance() {
        return meanDistance;
    }

    public void setMeanDistance() {
        meanDistance = (perihelion + aphelion) / 2;
    }

    public Vec3d getVec3d() {
        return vec3d;
    }

    public void setVec3d() {
        vec3d = new Vec3d();
        double randomAngle = Math.random() * 2 * Math.PI;
        vec3d.setX(meanDistance * Math.cos(randomAngle));
        vec3d.setY(meanDistance * Math.sin(randomAngle));
    }

    public double getAccelerations() {
        return accelerations;
    }

    public void setAccelerations(double v) {
        accelerations = v;
    }

    @Override
    public String toString() {
        return "{ name=" + name + ", orbits=" + orbits + ", mass=" + mass
                + ", diam=" + diameter + ", perihelion=" + perihelion
                + ", aphelion=" + aphelion + ", rotationalPeriod=" + rotationalPeriod
                + ", axialtilt=" + axialtilt + ", orbinclin=" + orbinclin
                + ", Mean distance from what it orbits=" + meanDistance + " }";
    }
}
