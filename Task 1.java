import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("Number Guessing Game ");

        while (playAgain) {

            int guessNumber = random.nextInt(100) + 1;
            int attempts = 3;
            boolean correctGuess = false;

            System.out.println("Generated Numbers Between 1 to 100");
            System.out.println("Attempts " + attempts);

            while (attempts > 0) {
                System.out.println("Enter Your Guess :");
                int playerGuess = scanner.nextInt();

                if (playerGuess == guessNumber) {
                    System.out.println("Correct ");
                    correctGuess = true;
                    score++;
                    break;
                } else if (playerGuess > guessNumber) {
                    System.out.println("Very High ");
                } else {
                    System.out.println("Very Low");
                }
                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!correctGuess) {
                System.out.println("You Lost . The Correct number was : " + guessNumber);
            }

            System.out.println("Current score :" + score);

            System.out.println("Play Again ? (yes/no)");
            String playerChoice = scanner.next();

            if (!playerChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Game Over ");
        System.out.println("Final Score: " + score);
        scanner.close();
    }
}
