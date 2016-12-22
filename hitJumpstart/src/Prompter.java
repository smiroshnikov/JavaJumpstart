import java.util.Scanner;

/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Prompter { // Prompter can be reused , in order to achieve that I should separate I/O
    // for example I could decide use 3 inputs and 1 output , in that case I need to rewrite this class or create a new
    // one with almost same code
    // handles IO
    private final Game game; // Game doesnt change during prompter

    public Prompter(Game game) {
        // private variable is equal to argument that came in
        this.game = game;
    }

    public boolean promptForGuess() {
        boolean isHit = false;
        boolean isAcceptable = false;
        Scanner scanner = new Scanner(System.in); // Scanner should be global and initialized in constructor
        // there is also no need to instantiate a new scanner object each time when this function is running
        // variable that without it class cannot work or exist should be in constructor
        do {
            // do while input is acceptable
            System.out.print("Please guess a letter : ");
            String guessInput = scanner.nextLine();
            //char guess = guessInput.toLowerCase().charAt(0); //solved by myself
            //char guess = guessInput.charAt(0); - no longer needed !
            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true; // break can and should be used here
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s .Please try again %n", iae.getMessage());
            }
            //Character guess = new Character(NEED-CHAR);
            // it is required to see if guess matches or not
            // this is games's class job
            // that's why game object is present in prompt's constructor
            // Game class also has a method applyGuess that will be used
        } while (!isAcceptable);
        return isHit;
        // TODO game done in python 2 years ago
    }

    public void displayProgress() { // should be in Game , can be replaced with Prompter function displayTries will
        // receive game as argument .
        // game with calculate a progress
        if (!game.isWon()) {
            System.out.printf("You have %d tries , to solve : %s%n", game.getRemainingTries(), game.getCurrentProgress());
        }
    }

    public void displayOutcome() {
        if (game.isWon()) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("GAME OVER ! Insert Coin ");
        }
    }
}
