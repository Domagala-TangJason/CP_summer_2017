
/**
 * Created by jd75746 on 3/8/2017.
 */
public class EmailVerify {

    public static void main(String[] args) {

        String address = "jas@hotmail.com";
        Boolean atSign;
        atSign = true;
        Boolean dot;
        dot = true;

        // a blank string to insert the input

// use && boolean operators to see if the addresses contain, then check if all are true

// or we can use nested if statements

        if (address.contains("@") && address.contains(".") && address.indexOf("@") > 0
                && address.indexOf(".") < address.length() && address.indexOf("@") < address.indexOf("."))
        {
            atSign = true;
            dot = true;
            System.out.println("This may be a valid email address");
        } else {
            System.out.println("Not a vaild email address");
        }


    }
}

