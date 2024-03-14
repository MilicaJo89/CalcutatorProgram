import java.util.Scanner;

public class Calculator {

    String symbols;
    double number1;
    double number2;
    double result;

    public void Calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Enter the symbol of the operation you want: + , - , * , / ");
        symbols = scanner.next();

        System.out.println("Enter first number: ");
        number1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        number2 = scanner.nextDouble();

        if (symbols.equals("+")) {
            result = number1 + number2;
            System.out.println("You have chosen addition");
            System.out.println("Result is: " + result);
        }
        if (symbols.equals("-")) {
            result = number1 - number2;
            System.out.println("You have chosen subtraction");
            System.out.println("Result is: " + result);
        }
        if (symbols.equals("*")) {
            result = number1 * number2;
            System.out.println("You have chosen multiplication");
            System.out.println("Result is: " + result);
        }
        if (symbols.equals("/")) {
            result = number1 / number2;
            System.out.println("You have chosen division");
            System.out.println("Result is: " + result);
        }
    }

}