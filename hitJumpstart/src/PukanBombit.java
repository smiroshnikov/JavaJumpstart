/**
 * Created by miross1 on 12/20/2016.
 */
public class PukanBombit {
    public static void main(String[] args) {
        String myPukan = "PukanBo458mb$t";
        char[] letterList = myPukan.toLowerCase().toCharArray();

        for (char letter : letterList) {
            try {
                if (!Character.isLetter(letter) && letter != '$') {
                    throw new IllegalArgumentException("Ubeisya Scuko!");
                }
                System.out.println(letter);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("moving on....");
    }
}
