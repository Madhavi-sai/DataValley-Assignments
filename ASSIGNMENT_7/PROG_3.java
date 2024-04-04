import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean vowelPresent = false;
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                vowelCount++;
            }
        }
        if (vowelPresent) {
            System.out.println("Vowels are present");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present");
        }
        sc.close();
    }
}
