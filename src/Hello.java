/**
 * Created by jd75746 on 3/8/2017.
 */
public class Hello {
    // first class project
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        int a;
        a = 5;
        int b = a++;
        // this increments a by 1, can use ++a to di it before assigning b

        int c = 11 % 4;
        // % is modulo, gives the remainder after dividing

        double d1 = 45.5;
        double d2 = 5.2;
        double d3 = d1 / d2;
        // You cant assign a double directly to a float because it is too long, lose percision
        // Must use new, creating an object oriented double type, and taking its float value

        System.out.println(d3);
        Float f1 = new Double(d3).floatValue();
        f1 = new Integer(b).floatValue();
        System.out.println(f1);
        // this adds a floating point type to b

        // Going the other way, making a float value into an integer

        Integer il = f1.intValue();

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(("c=" + c));
    }
}
