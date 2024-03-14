
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

            if (response.equals("yes") || response.equals("YES") || response.equals("Yes")) {
                calculator.Calculator();
            } else if (response.equals("no") || response.equals("NO") || response.equals("No")) {
                scanner.close();
            }

        }while (response.equals("yes") || response.equals("YES") || response.equals("Yes"));
    }
}