package codsoft;

import java.util.Random;
import java.util.Scanner;
public class Numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Number Game!");
	        System.out.println("Choose a difficulty level:");
	        System.out.println("1. Easy (1-50)");
	        System.out.println("2. Medium (1-100)");
	        System.out.println("3. Hard (1-500)");

	        int choice = scanner.nextInt();
	        int upperBound = 0;
	        int maxAttempts = 0;

	        switch (choice) {
	            case 1:
	                upperBound = 50;
	                maxAttempts = 10;
	                break;
	            case 2:
	                upperBound = 100;
	                maxAttempts = 7;
	                break;
	            case 3:
	                upperBound = 500;
	                maxAttempts = 5;
	                break;
	            default:
	                System.out.println("Invalid choice. Exiting the game.");
	                scanner.close();
	                return;
	        }

	        Random random = new Random();
	        int randomNumber = random.nextInt(upperBound) + 1;
	        int attempts = 0;

	        System.out.println("Guess a number between 1 and " + upperBound + ".");

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low! Attempts left: " + (maxAttempts - attempts));
	            } else {
	                System.out.println("Too high! Attempts left: " + (maxAttempts - attempts));
	            }
	        }

	        if (attempts == maxAttempts) {
	            System.out.println("Out of attempts! The correct number was: " + randomNumber);
	        }

	        scanner.close();
	}

}
