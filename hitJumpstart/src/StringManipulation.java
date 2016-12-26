import java.util.Arrays;

// Stuck with regex ? use visual regex online ! Fuck understanding ! Easy...
public class StringManipulation {
    public static void main(String[] args) {
        String example = "how can I get every @word@ in #separate _object ?";

        for (String i : example.split("[^\\w@#]+") //visual regex !
                ) {
            System.out.println(i);
        }
        String[] items = new String[10]; // OK declaration
        items[0] = "mace"; //  not effective , passing array with nulls inside
        items[1] = "hammer";
        items[2] = "blade";

        String[] extendedWeaponsList = new String[4];
        System.arraycopy(items, 0, extendedWeaponsList, 0, 4);
        for (String element : extendedWeaponsList) {
            System.out.println(element);
        }
        extendedWeaponsList[3] = "spear";
        // a bot more affective approach ?
        String[] secondArray = Arrays.copyOf(extendedWeaponsList, 12);

        Arrays.sort(extendedWeaponsList); // array with null will not be be sorted

        for (String e : secondArray
                ) {
            System.out.println(e);
        }
        String[] bullshit = {"Larry", "Bob"};
        bullshit = Arrays.copyOf(bullshit, 3);
        System.out.println("Here ! ");
        System.out.println(bullshit[2]);


    }
}
