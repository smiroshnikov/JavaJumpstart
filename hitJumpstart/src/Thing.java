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

        Object obj = treet; // reference of object type that points to my class@FAA23 , this is a pointer like in C
        // cannot use getDate method from Treet , can use only functions that Object have
        System.out.printf("%n (NE YAVNO )Explicit Downcasting  safe  %s %n", obj.toString()); // the reference knows that object has such overridden toString

        Treet another = (Treet) obj; // I have created a reference , that points to object but I am of Treet type and I
        // can use any treet methods // Upcasting is unsafe

        System.out.printf("Implicit YAVNO!!! %s %n", another);


        Object[] someStuff = {treet, "whatever String"};

        System.out.println(((Treet) someStuff[0]).getDescription()); // actually works!
        //System.out.println(((Treet) someStuff[1]).getDescription()); // will fail ! need more info on downcasting
        System.out.println(someStuff[0] instanceof Treet);

        System.out.println(someStuff[1] instanceof Treet);

        System.out.println(someStuff[0] instanceof String);

        System.out.println(someStuff[1] instanceof String);


    }
}
