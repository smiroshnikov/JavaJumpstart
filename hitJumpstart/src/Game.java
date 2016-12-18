/**
 * Created by Iidwuurliik on 12/17/2016.
 */
public class Game {
    public static final int MAX_MISSES = 7;
    // will know the answer
    private String answer;
    private String hits;
    private String misses;

    public int getRemainingTries(){
        return MAX_MISSES - misses.length();
    }

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

    public String getCurrrentProgress() { // 6:02
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '_';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

    // Adding a win method would be great here ...
}
