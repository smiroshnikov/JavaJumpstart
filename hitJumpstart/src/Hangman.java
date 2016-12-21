/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Hangman {
    public static void main(String[] args) {
//        char letter = 'B';
//        String example = "hello";
        if (args.length == 0) {
            System.out.println("usage java Hangman <answer>");
            System.out.println("answer is required !");
            System.exit(1);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game); // expects to receive game class

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            boolean isHit = prompter.promptForGuess();
//            if (isHit) {
//                System.out.println("We got a hit ! ");
//            } else {
//                System.out.println("You missed!");
//            }
            prompter.displayProgress();
            // break condition !

        }
        System.out.println(prompter.displayOutcome());
        if (!game.isWon()){System.out.printf("The word was %s", game.getAnswer());}

//        if (game.isWon()) {
//            System.out.println("You Win!");
//        } else {
//            System.out.println("Game Over , Insert Coin to Play again ...");
//        }


//        String coolExample = "This is a long fucking string ";
//        char[] chararray = coolExample.toCharArray();
//        System.out.print(chararray);

//        for (char kLetter : coolExample.toCharArray()) {
        // very nice without char array declaration looping over the elements
//            System.out.print(kLetter);
//        }

//        System.out.println(example.indexOf('e'));
//        System.out.println(example + "string" + "concatenation" + letter);
//        System.out.println(game.applyGuess('z'));
        // cool quiz , learned something
//        String lastName = "Oimmermann";
//        System.out.println(lastName.charAt(0));
//        if (lastName.charAt(0) >= 'A' && lastName.charAt(0)<'N') {
//            System.out.println("Ohohohohoho!");
//        }
    }
}
