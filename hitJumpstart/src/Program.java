public class Program {

    public static void printTextMoreTimes(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Rectangle ob = new Rectangle(3, 4);
        System.out.println(ob.area());
        Pez_1_0 yoda = new Pez_1_0();
        Pez_1_0 veider = new Pez_1_0();


        veider.characterName = "This is Darth Veider";
        System.out.println("Yoda characterName is " + yoda.characterName);
        yoda.characterName = "Can be changed to anything ??!?!?";
        System.out.println("Yoda public character name parameter has changed to -->  = " + yoda.characterName);
        System.out.println("Yoda secret name is  = " + yoda.getPrivateCharacterName());
        System.out.println("I used getter to get a publicCharacterName");

//
        //

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
    }
}

