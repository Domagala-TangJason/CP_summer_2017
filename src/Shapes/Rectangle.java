package Shapes;

/**
 * Created by Jason on 4/5/2017.
 */
public class Rectangle extends Shape
    implements PerimeterCalculation {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }
    // using inheritance to give rectangle properties from shape
    // super class is the same as a parent class
    public double calculateSurface(){
        return parA*parB;
    }

    @Override
    public double calculatePerimeter() {
        return 2*parA + 2*parB;
    }
}
