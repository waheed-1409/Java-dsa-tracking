package DAY1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int key=rand.nextInt(5);
        System.out.println("start the Game: ");
        while(true) {
            int guess = sc.nextInt();
            if (guess == key) {
                System.out.println("Correct! You guessed the number.");

            } else if (guess < key) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");

            }
        }
    }
}
