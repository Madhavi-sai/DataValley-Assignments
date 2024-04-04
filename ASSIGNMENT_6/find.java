import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }

            sum += num;
            count++;

            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        double average = (double) sum / count;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Average of all numbers: " + average);

        scanner.close();
    }
}
