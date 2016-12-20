/**
 * Created by miross1 on 12/20/2016.
 */
public class PukanBombit {
    public static void main(String[] args) {
        String myPukan = "PukanBomb$t!";
        char[] letterList = myPukan.toCharArray();

        try {
            for (char letter : letterList) {
                if (!Character.isLetter(letter) || letter != '$') {
                    throw new IllegalArgumentException("Ubeisya Scuko!");
                }
                System.out.println(letter);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("moving on....");
    }


}
