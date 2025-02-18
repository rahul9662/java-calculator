import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        
        System.out.println("Simple Java Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        switch (operator) {
            case '+': result = operations.add(num1, num2); break;
            case '-': result = operations.subtract(num1, num2); break;
            case '*': result = operations.multiply(num1, num2); break;
            case '/': result = operations.divide(num1, num2); break;
            default: System.out.println("Invalid operator!"); return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}
