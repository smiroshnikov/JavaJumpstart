/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Hangman {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("usage java Hangman <answer>");
            System.out.println("answer is required !");
            System.exit(1);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game); // expects to receive game class

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            //boolean isHit =
            prompter.promptForGuess();
            prompter.displayProgress();
        }
        prompter.displayOutcome();
        System.out.printf("The word was '%s'", game.getAnswer());
    }
}
