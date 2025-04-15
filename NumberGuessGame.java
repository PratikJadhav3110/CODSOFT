import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int playAgain;
        int totalScore = 0;

        do {
            int numberToGuess = ran.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean hasGuessed = false;

            System.out.println(" Guess the number between 1 and 100");
            System.out.println(" You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println(" Correct! You guessed it in " + attempts + " tries.");
                    totalScore += (maxAttempts - attempts + 1) * 10;
                    hasGuessed = true;
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println(" Too high!");
                } else {
                    System.out.println(" Too low!");
                }
            }

            if (!hasGuessed) {
                System.out.println(" You've run out of attempts. The number was: " + numberToGuess);
            }

            System.out.println(" Your current total score: " + totalScore);

            System.out.print("Play again? (1 = Yes, 0 = No): ");
            playAgain = sc.nextInt();

        } while (playAgain == 1);

        System.out.println(" Thanks for playing! Final Score: " + totalScore);
        sc.close();
    }
}
