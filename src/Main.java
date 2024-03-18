
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String response;


        Calculator calculator= new Calculator();
        calculator.Calculator();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Do you want to start the calculator again? yes or no");
            response= scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                calculator.Calculator();
            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("Calculator is closed");
                break;
            }
        }while (response.equalsIgnoreCase("yes"));
    }
}