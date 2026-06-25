import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        char op;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}
