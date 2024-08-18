import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        while (guess != randomNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;
                if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
