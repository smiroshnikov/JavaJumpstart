/**
 * Created by Iidwuurliik on 12/13/2016.
 */
public class Pez_2_0 {
    final private String characterName ;
    // "final" keyword to use to ensure that variables once assigned cannot be re-assigned
    // uncomment final to use  the swapHead example
    // Constructors do not have return statement , they are also named same as class

    public Pez_2_0(String characterName) {
        // I want the creator of the object to specify the name
        this.characterName = characterName  ; // why this is OK without this Max?
        // this.characterName = name; // what is the difference between those ? I know !
        // this is used to underline this instance
    }

    public String getCharacterName() {
        return characterName;
    }
//    public String swapHead (String characterName){
//        String originalCharacterName = this.characterName;
//        this.characterName = characterName;
//        return originalCharacterName;
//
//    }

}
