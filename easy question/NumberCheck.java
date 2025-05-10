//Positive, Negative or Zero Write a Java program that takes a number and prints whether the number is positive, negative, or zero.

public class NumberCheck {

    int number;

    // Constructor
    NumberCheck(int number) {
        this.number = number;
    }

    // Method to check if the number is positive, negative, or zero
    void checkNumber() {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        NumberCheck n1 = new NumberCheck(10);
        n1.checkNumber();

        NumberCheck n2 = new NumberCheck(-5);
        n2.checkNumber();

        NumberCheck n3 = new NumberCheck(0);
        n3.checkNumber();
    }
}
