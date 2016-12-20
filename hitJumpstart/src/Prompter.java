import java.util.Scanner;

/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Prompter {
    // handles IO
    private Game game;

    public Prompter(Game game) {
        // private variable is equal to argument that came in
        this.game = game;
    }

    public boolean promptForGuess() {
        boolean isHit = false;
        boolean isAcceptable = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please guess a letter : ");
            String guessInput = scanner.nextLine();
            //char guess = guessInput.toLowerCase().charAt(0); //solved by myself
            //char guess = guessInput.charAt(0); - no longer needed !
            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true;
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

    public void displayProgress() {
        System.out.printf("You have %d tries , to solve : %s%n", game.getRemainingTries(),
                game.getCurrrentProgress());
    }

    public String displayOutcome() {
        // TODO prompt win / lose messages and word instead of returning a string
        if (game.isWon()) {
            return "Congratulations!";
        } else {
            return "GAME OVER ! Insert Coin ";
        }
    }
}
