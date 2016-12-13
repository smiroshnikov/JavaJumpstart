import static java.lang.Thread.sleep;

/**
 * Created by Iidwuurliik on 12/13/2016.
 */
public class Pez_3_0 {
    // DON'T FORCE USER TO UNDERSTAND HOW OBJECT WORKS INTERNALLY!
    final private String characterName;
    final static public int MAX_PEZ = 12; // this is a CONSTANT declaration !
    // go private if no explicit reason to expose variable
    private int pez_count;

    public Pez_3_0(String characterName) {
        this.characterName = characterName;
        pez_count  = 0;
    }
    public void fill() throws InterruptedException {
        System.out.printf("Filling.");
        pez_count = MAX_PEZ;
        for (int i = 0; i < MAX_PEZ; i++) {
            Thread.sleep(300);
            System.out.printf(".");
        }
        System.out.println("DONE!");
    }

    public int getPez_count() {
        return pez_count;
    }

    public String getCharacterName() {
        return characterName;
    }
}