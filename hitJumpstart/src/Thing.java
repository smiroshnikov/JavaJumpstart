import java.util.Date;

import com.teamtreehouse.Treet;

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
    }
}
