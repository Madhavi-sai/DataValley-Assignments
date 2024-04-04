import java.util.Scanner;

public class CalculateExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses;

        if (quantity > 50) {
            totalExpenses = quantity * pricePerItem * 0.9; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95; // 5% discount
        } else {
            totalExpenses = quantity * pricePerItem; // No discount
        }

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}
