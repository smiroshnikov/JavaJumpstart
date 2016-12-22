import java.util.Date;

import com.teamtreehouse.Treet;
import sun.reflect.generics.tree.Tree;

/**
 * Created by Iidwuurliik
 */

public class Thing {
    public static void main(String[] args) {
        Date date = new Date(2016, 11, 11);
        Date date2 = new Date();
        Treet treet = new Treet(
                "Momo",
                "Free Penis Enlargement !",
                new Date(1482421000000L)); // don't forget about this , instantiated during other
        // class instantiation , also "L" for milliseconds from epoch
        System.out.println(treet.getDateWasSet());
        System.out.println(treet.toString());
        System.out.printf("%s", treet); // this is very very interesting , printf calls automatically for overriden toString class ?!

        Object obj = treet;
        System.out.printf("%n Upcast ?! %s %n", obj.toString()); // Max
        Treet another = (Treet) obj; // downcasting ?
        System.out.printf("Downcasting %s %n", another);
        Object[] someStuff = {treet, "whatever String"};
        System.out.println(((Treet) someStuff[0]).getDescription()); // actually works!
        //System.out.println(((Treet) someStuff[1]).getDescription()); // will fail ! need more info on downcasting
        System.out.println(someStuff[0] instanceof Treet);

        System.out.println(someStuff[1] instanceof Treet);

        System.out.println(someStuff[0] instanceof String);

        System.out.println(someStuff[1] instanceof String);


    }
}
