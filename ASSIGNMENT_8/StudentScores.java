import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student scores from user
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores.add(scanner.nextInt());
        }

        // Calculate average score
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.size();

        // Count and calculate median for each group (above, average, below)
        int aboveCount = 0, atAverageCount = 0, belowCount = 0;
        ArrayList<Integer> aboveScores = new ArrayList<>();
        ArrayList<Integer> atAverageScores = new ArrayList<>();
        ArrayList<Integer> belowScores = new ArrayList<>();
        for (int score : scores) {
            if (score > average) {
                aboveCount++;
                aboveScores.add(score);
            } else if (score == average) {
                atAverageCount++;
                atAverageScores.add(score);
            } else {
                belowCount++;
                belowScores.add(score);
            }
        }

        // Calculate median for each group (if applicable)
        double aboveMedian = 0, atAverageMedian = 0, belowMedian = 0;
        if (aboveCount > 0) {
            Integer[] aboveArray = aboveScores.toArray(new Integer[aboveCount]);
            Arrays.sort(aboveArray);
            aboveMedian = aboveArray[aboveCount / 2];
            if (aboveCount % 2 == 0) {
                aboveMedian = (aboveMedian + aboveArray[(aboveCount / 2) - 1]) / 2.0;
            }
        }
        if (atAverageCount > 0) {
            atAverageMedian = average;
        }
        if (belowCount > 0) {
            Integer[] belowArray = belowScores.toArray(new Integer[belowCount]);
            Arrays.sort(belowArray);
            belowMedian = belowArray[belowCount / 2];
            if (belowCount % 2 == 0) {
                belowMedian = (belowMedian + belowArray[(belowCount / 2) - 1]) / 2.0;
            }
        }

        // Print results
        System.out.println("\nNumber of students above average: " + aboveCount);
        if (aboveCount > 0) {
            System.out.println("Median score for students above average: " + aboveMedian);
        }
        System.out.println("\nNumber of students at average: " + atAverageCount);
        if (atAverageCount > 0) {
            System.out.println("Median score for students at average: " + atAverageMedian);
        }
        System.out.println("\nNumber of students below average: " + belowCount);
        if (belowCount > 0) {
            System.out.println("Median score for students below average: " + belowMedian);
        }
    }
}
