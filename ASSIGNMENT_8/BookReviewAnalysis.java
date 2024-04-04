public class BookReviewAnalysis {
    public static void main(String[] args) {
      int[] ratingsByRange = new int[2]; // 1-5 stars, 6-10 stars
      int positive = 0, neutral = 0, negative = 0;
  
      for (int rating = 1; rating <= 10; rating++) {
        if (rating <= 5) {
          ratingsByRange[0]++;
          if (rating < 3) {
            negative++;
          } else if (rating == 3) {
            neutral++;
          } else {
            positive++;
          }
        } else {
          ratingsByRange[1]++;
          positive++;
        }
      }
  
      System.out.println("Number of books rated 1-5 stars: " + ratingsByRange[0]);
      System.out.println("Number of books rated 6-10 stars: " + ratingsByRange[1]);
      System.out.println("Positive reviews: " + positive);
      System.out.println("Neutral reviews: " + neutral);
      System.out.println("Negative reviews: " + negative);
    }
  }
  