/**
 * Created by Jason on 3/20/2017.
 */
public class JavaStrings {
    public static void main(String[] args) {

        String x = "Jason";

        System.out.println(x.toUpperCase());
        System.out.println(x.substring(2));
        // will print out everything past the second character - counts from zero
        System.out.println(x.substring(2,4));
        // up to, but not including 4
        System.out.println(x.charAt(3));

        // String to number conversions using wrapper classes
        String a = "28";
        String b = "335135.124";

        int c = Integer.parseInt(a)/2;
        float d = Float.parseFloat(b);



    }
}
