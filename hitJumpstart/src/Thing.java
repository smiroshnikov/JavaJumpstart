import com.teamtreehouse.Treet;

/**
 * Created by Iidwuurliik
 */

public class Thing {
    public static void main(String[] args) {
        String test = new String("Max");
        String compareTest = new String("Max");
        Treet treet = new Treet();

        System.out.printf("This is instance of an empty  class ! -> %s %n", treet);
        if (test == compareTest) {
            System.out.printf("They are equal");
        } else {
            System.out.printf("Ebuchaya Java!");
            // they are actually not same object , thanks D. Craig
        }
    }
}