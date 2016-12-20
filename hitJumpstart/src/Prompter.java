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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please guess a letter : ");
        String guessInput = scanner.nextLine();
        char guess = guessInput.toLowerCase().charAt(0); //solved by myself
        //char g = guessInput.toLowerCase().charAt(0);
        //Character guess = new Character(g);


        // it is required to see if guess matches or not
        // this is games's class job
        // that's why game object is present in prompt's constructor
        // Game class also has a method applyGuess that will be used
        return game.applyGuess(guess); // Get this structure
        // TODO game done in python 2 years ago
    }

    public void displayProgress() {
        System.out.printf("You have %d tries , to solve : %s%n", game.getRemainingTries(),
                game.getCurrrentProgress());
    }
}
