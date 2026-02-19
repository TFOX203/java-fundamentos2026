package oopmodeling;

public class CelestialBody {
    // las variables por defecto
    protected double mass = 1000000;
    String name = "Unknown";
	public float radius = 12343434.3f;

    public double getMass() { return mass;}
    public String getName() { return name;}
    public float getRadius() {return radius;}
    public  void  setMass(double mass) {this.mass = mass;}
    public  void  setName(String name) {this.name = name;}
    public  void  setRadius(float radius) {this.radius = radius;}
    //contructor of this class
    public CelestialBody(){}
    public CelestialBody(String name){
        this.name = name;
    }
    public CelestialBody(double mass, String name){
        this.name = name;
        this.mass = mass;
    }

}
