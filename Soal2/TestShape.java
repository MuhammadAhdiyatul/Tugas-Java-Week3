package Soal2;

public class TestShape {
    public static void main(String[] args) {
        
        Shape s1 = new Shape("blue", false);
        System.out.println("--- Test Shape ---");
        System.out.println(s1.toString());

        
        Circle c1 = new Circle(5.5, "red", false);
        System.out.println("\n--- Test Circle ---");
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        
        Rectangle r1 = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println("\n--- Test Rectangle ---");
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

    
        Square sq1 = new Square(5.0, "purple", true);
        System.out.println("\n--- Test Square ---");
        System.out.println(sq1.toString());
        System.out.println("Area: " + sq1.getArea()); // Menggunakan getArea() warisan Rectangle
        
        
        sq1.setWidth(10.0);
        System.out.println("\nSetelah setWidth(10.0):");
        System.out.println(sq1.toString());
        System.out.println("New Area: " + sq1.getArea());
    }
}
