public class Pez_1_0 {
    private String privateCharacterName = "Bob"; // not even instances of the class will have access to this !
    // a good idea to expose this name  without allowing to modify it would be a getter ?!!!??! Brilliant !

    String characterName = "Yoda"; // this is hardcoded and will not survive design changes
    //  I will need to create a method that will run when I instantiate a class - constructor !!!!
    // moving to Pez_2_0

    public String getPrivateCharacterName() { // will return String - logically
        return privateCharacterName;
    }




}


