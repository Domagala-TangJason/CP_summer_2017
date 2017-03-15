import javax.xml.soap.SAAJResult;

/**
 * Created by jd75746 on 3/8/2017.
 */
public class TextOper {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
// Joining together two strings
        System.out.println(s3);

        int posBC = s3.indexOf("ab");
        System.out.println(posBC);
        // Shows the location where the sequence begins, the first time it appears. Counts from zero
        // can also use .lastIndexOf

        String s4 = s3.substring(1, 3);
        System.out.println(s4);
        // will return a part of a string that you specify (assigned to s4)

        s4 = s3.replace("ab", "AB");
        // replace the value in the string

        s4 = s4.toUpperCase();
        // makes it all uppercase

        int s4len = s4.length();

        System.out.println(s4len);

        char cl = s4.charAt(4);
        // remember they are indexed from 0 so it shows the 5th digit
        System.out.println(cl);

        if ((s4.contains("F")) && (s4.length() < 7)) {
            System.out.println("s4 contains F");
        }
        else {
            System.out.println("s4 doesn't contain F");
        }
    }
    // &&  - AND || - OR
    /* OR || at least one must be true
    AND && both must be true
     */


}
