import java.util.Scanner;

public class Calculator {

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static double subtract(double a, double b) {
        return a - b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static String divide(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Cannot divide by zero!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose operation: +, -, *, /");
        String operation = input.next();

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        
        switch (operation) {
            case "+":
                System.out.println("Result: " + add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "/":
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }

        input.close();
    }
}
