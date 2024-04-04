import java.util.Scanner;

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Main {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int testNumber = scanner.nextInt();
            validateNumber(testNumber);
            scanner.close();
        } catch (CustomValidationException e) {
            System.out.println("Custom Validation Exception: " + e.getMessage());
        }
    }
}