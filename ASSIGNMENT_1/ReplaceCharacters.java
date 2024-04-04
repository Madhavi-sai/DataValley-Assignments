import java.util.Scanner;

public class CharacterReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the index to replace: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= inputString.length()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);

        String modifiedString = replaceCharAtIndex(inputString, index, replacementChar);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        char[] charArray = str.toCharArray();
        charArray[index] = replacement;
        return new String(charArray);
    }
}