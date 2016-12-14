import static java.lang.Thread.sleep;

/**
 * Created by Iidwuurliik on 12/13/2016.
 */
public class Pez_3_0 {
    // DON'T FORCE USER TO UNDERSTAND HOW OBJECT WORKS INTERNALLY!
    final private String characterName;
    final static public int MAX_PEZ = 12; // this is a CONSTANT declaration !
    // go private if no explicit reason to expose variable
    private int pezCount;

    public Pez_3_0(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    // this method is overloaded below , can be useful for monkey patching
    public void fill() throws InterruptedException {
        System.out.printf("Filling.");
        fill(MAX_PEZ);
        for (int i = 0; i < MAX_PEZ; i++) {
            Thread.sleep(300);
            System.out.printf(".");
        }
        System.out.println("DONE!");
    }

    // this method is called from within overloaded method in order not to repeat myself
    // TODO I need to create an exception if user uses fill method that will prevent user from overfilling pez dispenser
    // TODO with values greater than allowed MAX_PEZ
    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many Pez !!!");
        }
        pezCount = newAmount;
    }

    public int getPezCount() {
        return pezCount;
    }

    public String getCharacterName() {
        return characterName;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }


}
