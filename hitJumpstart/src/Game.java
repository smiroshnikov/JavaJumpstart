/**
 * Created by Iidwuurliik
 */

public class Game {
    public static final int MAX_MISSES = 7;
    private final String answer;
    private String hits; // should be stringbuilders for optimization purposes
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

    public boolean applyGuess(char letter) { // try to use exceptions only when necessary , slows performance!
        // IllegalArgumentException should be used in constructor , 99% of Java devs do this , should be documented
        // will prevent incorrect / invalid object instantiation
        letter = normalizedGuess(letter);
        boolean isHit = answer.indexOf(letter) != -1; // this is a weird way to search...NOT not found
        if (isHit) { // good practice is to evade such simple variables , can be used for better readability
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
        // reusing method is also very good , only 1 place to add functionality and fix errors
        if (letters.isEmpty()) {
            throw new IllegalArgumentException("Empty Input ! ");
        }
        return applyGuess(letters.charAt(0));
    } // method overloading ! cool
    // I overloaded method that accepts char with method that accepts strings
    // and within string method I called char method , this solved 2 issues
    // I can accept strings and empty strings as input

    public String getCurrentProgress() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char letter : answer.toCharArray()) {
            if (hits.indexOf(letter) == -1) {
                letter = '_';  // SHOULD BE CONST , HARDCODED VALUE , object is destroyed right after creation
                // optimized with CONST , and also will provide a single place to change
            }
            stringBuilder.append(letter); // string concatenation is very ineffective , creating a lot of object that are
            // destroyed right after usage. If I  had 50 string concatenated in similar way  49 objects would be
            // ineffective and highly overloading garbage collector, replaced with stringbuilder instance
        }
        return stringBuilder.toString();
    }

    private char normalizedGuess(char letter) { // not related to Game logic , this function should be in prompter
        //  separate functionality lowerCase and and user error , not reusable !
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
    } // CONST !!!
}
