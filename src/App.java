import java.beans.Transient;
import java.util.Scanner;

public class ComplexJavaCodeWithError {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 2;

        System.out.println("Welcome to the Complex Calculator!");
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performAddition();
                break;
            case 2:
                performSubtraction();
                break;
            case 3:
                performMultiplication();
                break;
            case 4:
                performDivision();
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        scanner.close();
    }

    private static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Result of addition: " + result);
        scanner.close();
    }

    private static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.println("Result of subtraction: " + result);
        scanner.close();
    }

    private static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 * num2;
        System.out.println("Result of multiplication: " + result);
        scanner.close();
    }

    private static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return;
        }
        int result = num1 / num2;
        System.out.println("Result of division: " + result);
        scanner.close();
    }
}
