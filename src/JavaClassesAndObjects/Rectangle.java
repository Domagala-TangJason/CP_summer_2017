package JavaClassesAndObjects;

/**
 * Created by Jason on 4/5/2017.
 */
public class Rectangle {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        setParams(sideA,sideB);
    }

    public void setParams(double sideA, double sideB){
        //sideA=sideA wont work because it wont pull from the class
        this.sideA = sideA;
        this.sideB = sideB;
    }
    // method to the rectangle class
    public double calculateSurface(){
        return sideA*sideB;
    }

}
