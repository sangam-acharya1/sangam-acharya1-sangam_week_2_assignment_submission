//Simple Calculator (if-else) Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.
public class SimpleCalculator {

    double num1;
    double num2;
    char operator;

    // Constructor
    SimpleCalculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // Method to calculate result
    void calculate() {
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        SimpleCalculator calc1 = new SimpleCalculator(10, 5, '*');
        calc1.calculate();

        SimpleCalculator calc2 = new SimpleCalculator(10, 0, '/');
        calc2.calculate();

        SimpleCalculator calc3 = new SimpleCalculator(7, 3, '-');
        calc3.calculate();
    }
}
