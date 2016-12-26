// Stuck with regex ? use visual regex online ! Fuck understanding ! Easy...
public class StringManipulation {
    public static void main(String[] args) {
        String example = "how can I get every @word@ in #separate _object ?";

        for (String i : example.split("[^\\w@#]+") //visual regex !
                ) {
            System.out.println(i);
        }
        String[] items = new String[10]; // OK declaration
        items[0] = "blade";
        items[1] = "hammer";
        items[2] = "mace";

        for (String item : items
                ) {
            if (item != null) {
                System.out.println(item);
            }


        }


    }
}
