package internship.week1;

public class JavaOperators {
   public static void main(String[] args) {
      int x = 100 + 50;
      int y = 100 - 50;
      int z = 100 * 50;
      int q = 100 / 50;

      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      System.out.println(q);

      int highScorePosition = calculateHighScorePosition(1500);
      displayHighScorePosition("Tim", highScorePosition);
      }
   public static void displayHighScorePosition (String playerName, int highScorePosition){
      System.out.println(playerName + " managed to get into position "
      + highScorePosition + " on ths high score list");
   }
   public static int calculateHighScorePosition(int playerScore) {
       if (playerScore >= 1000) {
          return 1;
       } else if (playerScore >= 500 && playerScore < 1000) {
          return 2;
       } else if (playerScore >= 100 && playerScore < 500 ) {
          return 3;
      } else {
          return 4;
       }
   }
}

