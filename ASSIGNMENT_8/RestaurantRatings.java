import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantRatings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define rating ranges (modify ranges as needed)
        int[][] ranges = {{1, 5}, {6, 10}};

        // Get restaurant ratings from user
        ArrayList<Integer> ratings = getRatings(scanner);

        // Process and store results
        HashMap<int[], Result> results = processRatings(ratings, ranges);

        // Print results
        printResults(results);
    }

    public static ArrayList<Integer> getRatings(Scanner scanner) {
        ArrayList<Integer> ratings = new ArrayList<>();
        System.out.println("Enter restaurant ratings (one per line, enter -1 to stop):");
        while (true) {
            int rating = scanner.nextInt();
            if (rating == -1) {
                break;
            }
            ratings.add(rating);
        }
        return ratings;
    }

    public static HashMap<int[], Result> processRatings(ArrayList<Integer> ratings, int[][] ranges) {
        HashMap<int[], Result> results = new HashMap<>();
        for (int[] range : ranges) {
            results.put(range, new Result(0, 0.0)); // Initialize count and total for each range
            for (int rating : ratings) {
                if (rating >= range[0] && rating <= range[1]) {
                    results.get(range).count++;
                    results.get(range).total += rating;
                }
            }
            // Calculate average (avoid division by zero)
            if (results.get(range).count > 0) {
                results.get(range).average = results.get(range).total / results.get(range).count;
            }
        }
        return results;
    }

    public static void printResults(HashMap<int[], Result> results) {
        System.out.println("\nRestaurant Rating Results:");
        for (int[] range : results.keySet()) {
            Result result = results.get(range);
            System.out.printf("Ratings between %d and %d: %d restaurants (average: %.2f)\n",
                    range[0], range[1], result.count, result.average);
        }
    }

    static class Result {
        int count;
        double total;
        double average;

        public Result(int count, double total) {
            this.count = count;
            this.total = total;
        }
    }
}
