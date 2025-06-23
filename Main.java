import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String choice;

        do {
            System.out.println("Welcome to the Basic Calculator!");
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextLine();

            if (!choice.equals("5")) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case "1":
                        System.out.println("Result: " + calculator.add(num1, num2));
                        break;
                    case "2":
                        System.out.println("Result: " + calculator.subtract(num1, num2));
                        break;
                    case "3":
                        System.out.println("Result: " + calculator.multiply(num1, num2));
                        break;
                    case "4":
                        if (num2 != 0) {
                            System.out.println("Result: " + calculator.divide(num1, num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (!choice.equals("5"));

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}