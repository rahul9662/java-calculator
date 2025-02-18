import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public double getNumber(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public char getOperator() {
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void closeScanner() {
        scanner.close();
    }
}
