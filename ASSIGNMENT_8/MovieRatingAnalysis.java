import java.util.HashMap;

public class MovieRatingAnalysis {
  public static void main(String[] args) {
    HashMap<String, Integer> ratingsByCategory = new HashMap<>();
    ratingsByCategory.put("PG", 3);
    ratingsByCategory.put("PG-13", 5);
    ratingsByCategory.put("R", 2);

    double totalRating = 0;
    int totalMovies = 0;

    for (String category : ratingsByCategory.keySet()) {
      int rating = ratingsByCategory.get(category);
      totalRating += rating;
      totalMovies++;

      System.out.println("Number of movies rated " + category + ": " + rating);
    }

    double averageRating = totalRating / totalMovies;
    System.out.println("Average rating for all categories: " + averageRating);
  }
}
