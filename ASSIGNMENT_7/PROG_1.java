import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter the year of joining: ");
        int joiningYear = sc.nextInt();
        int yearsOfService = currentYear - joiningYear;
        if (yearsOfService > 5) {
            System.out.println("You are eligible for a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("You are eligible for a bonus of Rs. 3000/-");
        } else {
            System.out.println("no bonus is awarded.");
        }
        sc.close();
    }
}
