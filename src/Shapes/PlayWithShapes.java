package Shapes;

/**
 * Created by Jason on 4/5/2017.
 */
public class PlayWithShapes {

    public static void main(String[] args) {
        //Shape sh1 = new Shape(23, 34); this doesnt work now because Shape is an abstract class
        //System.out.println(sh1.toString());
        // makes it print out nicer, and prints out a description of the object

        Rectangle r1 = new Rectangle(21, 13);
        System.out.println(r1.calculateSurface());

        Circle c1 = new Circle(32);
        System.out.println(c1.toString() + c1.calculateSurface());


    }
}
