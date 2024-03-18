
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    String symbols;
    double number1;
    double number2;
    double result;


    public void Calculator() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the calculator");

            System.out.println("Enter first number: ");
            number1 = scanner.nextDouble();


            System.out.println("Enter the symbol of the operation you want: + , - , * , / ");
            if (scanner.hasNextDouble()) {
                throw new InputMismatchException();
            } else {
                System.out.println("Enter the symbol of the operation you want: + , - , * , / ");
                symbols = scanner.next();
            }

            System.out.println("Enter second number: ");
            number2 = scanner.nextDouble();

            if (symbols.equals("+")) {
                result = number1 + number2;
                System.out.println("You have chosen addition");
                System.out.println(number1 + "+" + number2 + "=" + result);
                System.out.println("Result is: " + result);
            }
            if (symbols.equals("-")) {
                result = number1 - number2;
                System.out.println("You have chosen subtraction");
                System.out.println(number1 + "-" + number2 + "=" + result);
                System.out.println("Result is: " + result);
            }
            if (symbols.equals("*")) {
                result = number1 * number2;
                System.out.println("You have chosen multiplication");
                System.out.println(number1 + "*" + number2 + "=" + result);
                System.out.println("Result is: " + result);
            }
            if (symbols.equals("/")) {
                if (number2 == 0) {
                    throw new ArithmeticException();
                }
                result = number1 / number2;
                System.out.println("You have chosen division");
                System.out.println(number1 + "/" + number2 + "=" + result);
                System.out.println("Result is: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero. Try again.");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input.Try again");
        }
    }
}