import com.teamtreehouse.Treet;

import java.util.Date;

/**
 * Created by Iidwuurliik
 */

public class Thing {
    public static void main(String[] args) {
        Date date = new Date(2016, 11, 11);
        Date date2 = new Date();
        Treet treet = new Treet("Momo", "Free Penis Enlargement !", date);

        System.out.println(treet.getDateWasSet());


    }
}
