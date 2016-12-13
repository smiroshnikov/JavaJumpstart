public class Pez_1_0 {
    private String privateCharacterName = "Bob"; // not even instances of the class will have access to this !
    // a good idea to expose this name  without allowing to modify it would be a getter ?!!!??! Brilliant !
    String characterName = "Yoda";

    public String getPrivateCharacterName() { // will return String - logically
        return privateCharacterName;
    }
}


