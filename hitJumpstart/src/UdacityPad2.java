/**
 * Created by miross1 on 12/19/2016.
 */
public class UdacityPad2 {
    public static void main(String[] args) {
        int n = 10;
        while (n > 1) {
            System.out.println(n);
            if ((n % 2) == 0) {
                n = n / 2;
            } else
                n = 3 * n + 1;

        }


    }
}
