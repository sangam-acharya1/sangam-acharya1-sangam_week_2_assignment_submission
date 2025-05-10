//Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).
    
public class Car {

    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", "Fortuner", 4200000);
        cars[1] = new Car("Hyundai", "Verna", 1800000);
        cars[2] = new Car("BMW", "X5", 8500000);
        cars[3] = new Car("Tata", "Harrier", 2100000);
        cars[4] = new Car("Kia", "Seltos", 1600000);

      
        System.out.println("Cars priced above ₹20,00,000:");

         for (int i = 0; i < cars.length; i++) {
            if (cars[i].price > 2000000) {
                cars[i].displayDetails();
            }
        }
    }
}
