/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Hangman {
    public static void main(String[] args) {
        char letter = 'B';
        String example = "hello";
        Game game = new Game("threehouse");
        System.out.println(example.indexOf('e'));
        System.out.println(example + "string" + "concatenation" + letter);
        System.out.println(game.applyGuess('z'));


    }
}
