package Shapes;

/**
 * Created by Jason on 4/5/2017.
 */
public abstract class Shape implements Comparable<Shape> {

    // protected makes it private + visible to children
    protected double parA;
    protected double parB;

    public Shape(double parA, double parB){
        setParams(parA,parB);
    }
    public void setParams(double parA,double parB){
        this.parA = parA;
        this.parB = parB;
    }

    //public abstract double calculateSurface();

    @Override
    public int compareTo (Shape shape){
        Double mySurface = Double.valueOf(calculateSurface());
        Double otherSurface = Double.valueOf(shape.calculateSurface());
        return mySurface.compareTo(otherSurface);
        //need to make these into object oriented values in order to compare them
    }

    // need this as a catch for object. Shape is never actually used, it is only a structure. Abstract class
    // will never be invoked unless the class does not have its own calculateSurface. See square
   /*public double calculateSurface(){
        return 0;
    } */
   public abstract double calculateSurface();
   //the above code causes an error in square, because it does not specify calculateSurface


    // these are methods by default from java.object which is inhereted if nothing else is specified
    // Override is a type of polymorphism, changes the way toString() works
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + '{' +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
//homework: two types of triangles and play with these objects
