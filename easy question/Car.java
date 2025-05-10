//Create Multiple Objects Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.
public class Car {

    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method 
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
      
    }

    public static void main(String[] args) {
      
        Car car1 = new Car("Toyota", 2020);
        car1.displayDetails();

        
        Car car2 = new Car("Honda", 2022);
        car2.displayDetails();
    }
}

