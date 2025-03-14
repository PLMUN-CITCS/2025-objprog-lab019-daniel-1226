import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (true) {
            System.out.print("Enter a non-negative integer: ");
            try {
                number = Integer.parseInt(scanner.nextLine());

                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
            }
        }

        return number;
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;

        if (n == 0) {
            return factorial;
        }

        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        
        int number = getNonNegativeInteger();

        long result = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + result);
    }
}
