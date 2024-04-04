public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }

    public static void printOddPositionCharacters(String text) {
        text = text.replaceAll("\\s", "") // Remove white spaces
        for (int i = 0; i < text.length(); i ++) {
            if (i % 2 != 0) {
                System.out.println(text.charAt(i) + " ");
            }
        }
    }
    
}
