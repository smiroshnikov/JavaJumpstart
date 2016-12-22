/**
 * Created by Iidwuurliik
 */

public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    public String getAnswer() {
        return answer;
    }

    public int getRemainingTries() {
        return MAX_MISSES - misses.length();
    }

    public Game(String answer) {
        this.answer = answer.toLowerCase();
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        letter = normalizedGuess(letter);
        boolean isHit = answer.indexOf(letter) != -1; // this is a weird way to search...NOT not found
        if (isHit) {
            hits += letter;
            // Debug messages
            //System.out.printf("hits are %s %n ", hits);
        } else {
            misses += letter;
            //Debug messages
            // System.out.printf("misses are %s %n", misses);
        }
        return isHit;
    }

    public boolean applyGuess(String letters) {
        if (letters.isEmpty()) {
            throw new IllegalArgumentException("Empty Input ! ");
        }
        return applyGuess(letters.charAt(0));
    } // method overloading ! cool
    // I overloaded method that accepts char with method that accepts strings
    // and within string method I called char method , this solved 2 issues
    // I can accept strings and empty strings as input

    public String getCurrentProgress() {
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

    private char normalizedGuess(char letter) {
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Fuck you ! This is not a letter !");
        }
        if (misses.indexOf(Character.toLowerCase(letter)) != -1 || hits.indexOf(Character.toLowerCase(letter)) != -1) {
            throw new IllegalArgumentException(letter + " has already been guessed!");
        }
        letter = Character.toLowerCase(letter);
        return letter;
    }

    public boolean isWon() {
        return getCurrentProgress().indexOf('_') == -1;
    }
}
