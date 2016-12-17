/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Game {
    // will know the answer
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1; // this is a weird way to search...
        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return isHit;
    }
}
