//Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. Create two Circle objects and display their area and circumference.
public class Circle {

    double radius;
    final double PI = 3.14159; 

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

 
    double calculateCircumference() {
        return 2 * PI * radius;
    }

    
    double calculateArea() {
        return PI * radius * radius;
    }


    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
       
        Circle c1 = new Circle(5.0);
        c1.displayDetails();

        Circle c2 = new Circle(7.5);
        c2.displayDetails();
    }
}


    

