package Soal1;

public class TestCylinder { 
    public static void main(String[] args) {
      
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:");
        System.out.println(" radius=" + c1.getRadius() + ", height=" + c1.getHeight());
        System.out.println(" surface area=" + c1.getArea()); 
        System.out.println(" volume=" + c1.getVolume());
        System.out.println(" " + c1.toString() + "\n"); 

        
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder 2:");
        System.out.println(" radius=" + c2.getRadius() + ", height=" + c2.getHeight());
        System.out.println(" surface area=" + c2.getArea());
        System.out.println(" volume=" + c2.getVolume());
        System.out.println(" " + c2.toString() + "\n");

        
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3:");
        System.out.println(" radius=" + c3.getRadius() + ", height=" + c3.getHeight());
        System.out.println(" surface area=" + c3.getArea());
        System.out.println(" volume=" + c3.getVolume());
        System.out.println(" " + c3.toString());
    }
}