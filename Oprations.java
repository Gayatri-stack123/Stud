public class Oprations {
    private double number;

    // Constructor
    public Oprations(double number) {
        this.number = number;
    }

    // Method to calculate power
    public double power(double exponent) {
        return Math.pow(number, exponent);
    }

    // Method to calculate square root
    public double squareRoot() {
        return Math.sqrt(number);
    }

    // Method to calculate cube root
    public double cubeRoot() {
        return Math.cbrt(number);
    }

    // Main method
    public static void main(String[] args) {
        // Example: Creating an object of MathOperations with the number 8
        Oprations mathOp = new Oprations(8);

        // Perform operations
        System.out.println("Square Root: " + mathOp.squareRoot());
        System.out.println("Cube Root: " + mathOp.cubeRoot());
        System.out.println("Power (8^2): " + mathOp.power(2)); // Example: power of 8 raised to 2
    }

}
