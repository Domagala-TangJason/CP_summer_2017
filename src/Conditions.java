/**
 * Created by Jason on 3/15/2017.
 */
public class Conditions {
    public static void main(String[] args) {
        boolean b1;
        b1 = true && false;

        if (b1) {
            System.out.println("b1 is true");
        }

        int a = 3;
        {
            int b = 2;
            System.out.println("2nd line " + a + b);

            {
                System.out.println(b);
            }
        }
      //  System.out.println(b);
        // Since b was specified in the block, it can only be seen within it, cant be called outside

    // exclusive OR is used and only one can be true XOR

/*
    double n = 6;
    if (n => 5 && n <= 8){
        System.out.println("n is within the limit");
    }
    if (!(n => 5 && n <= 8)){
        System.out.println("n is not within the limit");
    }
    // can use the opposite ! to cover all other values
    // can use n <= 5 || n >= 8. This is the better way to do it

    String a = "a";
        if (a.equals("a")) {
        System.out.println("A");
    } else if (a.equals("B")) {
        System.out.println("b");
    } else if (a.equals("c"));
    // This works but it is not very elegant. You can use switch expressions

        switch (a) {
        case "A":
            System.out.println("AA");
            break;
        case "B":
            System.out.println("BB");
            break;
        default:
            System.out.println("neither a b or c");

    }

    // there are also one line ifelse statement, but only for simple expressions

    int result = a.equals("B") ? 10 : 9;
        System.out.println("res = " + result);

*/

    }
}

