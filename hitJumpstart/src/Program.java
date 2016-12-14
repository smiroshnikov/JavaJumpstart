import com.sun.xml.internal.bind.v2.TODO;

// this is my main program class name is not relevant as long as it includes main class
public class Program {
    //  TODO re-write alchemy as tomorrow morning!


    public static void main(String[] args) throws InterruptedException {
        Pez_3_0 pd = new Pez_3_0("Yoda");
        System.out.println("pd.getPez_count() = " + pd.getPez_count());
        pd.fill();
        System.out.println("pd.isEmpty() = " + pd.isEmpty());
        if (pd.isEmpty()) {
            System.out.println("PezDispenser is FULL!");
        }
        while (pd.dispense()) {
            System.out.println("Аммм....");
        }
        if (pd.isEmpty()) {
            System.out.println("Ate everything ! ");
        }
        System.out.println("pd.getPez_count() = " + pd.getPez_count());
        pd.fill(3);
        System.out.println("pd.getPez_count() = " + pd.getPez_count());
        pd.fill(4);
        System.out.println("pd.getPez_count() = " + pd.getPez_count());
//        System.out.println("pd.MAX_PEZ = " + pd.MAX_PEZ);
//        // this gets a warning due to being class scope static variable
//        System.out.println("Pez_3_0.MAX_PEZ = " + Pez_3_0.MAX_PEZ);
//        // The line above due to final and static is equivalent to line below
//        // in terms of definition
//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        // Praise my lecturer !for this amazing example !
//        System.out.println("pd.getPez_count() = " + pd.getPez_count());
//        System.out.println("pd.isEmpty() = " + pd.isEmpty());
//        pd.fill(); // added Thread.sleep and InterruptedException
//        System.out.println("pd.getPez_count() = " + pd.getPez_count());


        //
//        GoKart modelA = new GoKart("blue");
//        System.out.println("modelA.getColor() = " + modelA.getColor());


//System.out.printf("Previous head was %s and new head is %s",donatello.swapHead("Mimi"),donatello.getCharacterName());
        //        Rectangle ob = new Rectangle(3, 4); // instantiation occurs only when I use *new* keyword!
//        Pez_1_0 yoda = new Pez_1_0();
//        Pez_1_0 veider = new Pez_1_0();
        //        System.out.println(ob.area());
//        veider.characterName = "This is Darth Veider";
//        System.out.println("Yoda characterName is " + yoda.characterName);
//        yoda.characterName = "Can be changed to anything ??!?!?";
//        System.out.println("Yoda public character name parameter has changed to -->  = " + yoda.characterName);
//        System.out.println("Yoda secret name is  = " + yoda.getPrivateCharacterName());
//        System.out.println("I used getter to get a publicCharacterName");

        //printTextMoreTimes("Java is very nice!", 2);
        //String fistName = "Sergei";
        //boolean isSergei = fistName.equals("Sergei");
        //System.out.println(isSergei);
        //System.out.println(fistName.equalsIgnoreCase("SERGEI"));
        //String someWords = "A bunch of Words ! ";
        //System.out.println("someWords contain 'bunch' = " + someWords.contains("bunch"));
        //System.out.println("This is chained method " + someWords.toLowerCase().contains("words"));
        //boolean coolExample = false || false || true;
        //System.out.println("coolExample is always  " + coolExample);
        //
//        Pez_2_0 donatello = new Pez_2_0("Donatello");
//        Pez_1_0 yoda = new Pez_1_0();
//
//        System.out.println("yoda = " + yoda.characterName);
//        System.out.println("donatello = " + donatello.getCharacterName());
    }

}

