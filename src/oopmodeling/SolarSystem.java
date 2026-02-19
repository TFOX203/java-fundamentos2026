package oopmodeling;


public class SolarSystem {
    public static void main(String[] args){
        Object obj1 = new Planet();
        Planet obj2 = new Planet();
        Planet jupiter = new Planet(324234, "jupiter");
        Planet jupiter2 = new Planet(324234, "jupiter");
        Planet mars = new Planet(435345, "marte", 2343);
        System.out.println(jupiter.getName());

        CelestialBody body3 = new Planet();
        //Solarsystem ss = new Planet();
        System.out.println(obj1);
        System.out.println(obj2);
        obj1 =obj2;
        System.out.println(obj1);


    }
}

