package TeachingExercise;

public class Te01MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sarath", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Kumaar", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Gokul", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Kannan", highScorePosition);

        highScorePosition = calculateHighScorePosition(-15000);
        displayHighScorePosition("Sarath", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position= 2;
        } else if (playerScore >= 100 ) {
            position=3;
        }return position;
    }
}
