package bryant_7_guessinggame;

import java.util.Scanner;
import java.util.Random;

public class Bryant_7_GuessingGame {

    static String Name;
    static int Guess;
    static int MagicNumber;
    static Random random;
    static boolean playagain = true;
    
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        random = new Random();
        MagicNumber = (random.nextInt(9) + 1);
        System.out.println("What's your name?");
        Name = game.nextLine();
        System.out.println("Hello " + Name + ", Pick a number 1 through 10. After you pick your number, you will see if you guessed the number correctly!");
        while (playagain) {
            playthegame();
        }
    }
    public static void playthegame() {
        Scanner guess = new Scanner(System.in);
        Guess = guess.nextInt();
        if (Guess == MagicNumber) {
            System.out.println("Congrats! Your number, " + Guess + ", was correct! You win!");
            playagain = false;
        } else if (Guess > 10) {
            System.out.println("Really? Did you read the instructions? I feel like you want to make me mad... Guess the numbers 1 through 10!");
        } else if (Guess < MagicNumber) {
            System.out.println("Sorry to say that your guess, " + Guess + ", was incorrect. Guess higher!");
        } else if (Guess > MagicNumber) {
            System.out.println("Sorry to say that your guess, " + Guess + ", was incorrect. Guess lower!");
        }
    }
}
