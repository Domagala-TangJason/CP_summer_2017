package JavaClassesAndObjects;

/**
 * Created by Jason on 4/5/2017.
 */
public class PlayWithRectangles {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12,34);
        //r1.setParams(45,24);
        double surface = r1.calculateSurface();
        System.out.println(surface);
        System.out.println(r1.toString());

    }
}
